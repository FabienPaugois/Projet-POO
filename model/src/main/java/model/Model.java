 package model;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.Boulder;
import entity.Character;
import entity.Diamond;
import entity.Dirt;
import entity.Door;
import entity.Entity;
import entity.Wall;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	Wall wall;
	Dirt dirt;
	Boulder boulder;
	Diamond diamond;
	Void air;
	public Character character;
	Door door;
	
	int level = 0;
	
	private String[] TabLine = new String[22];
	private String[] TabLine2 = new String[40];
	private String[][] TabMap = new String[22][40];
	private Entity[][] TabEntity;
	private Image[][] Map = new Image[22][40];
	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.TabEntity = new Entity[22][40];
	}

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getTabLine(int i, int j) {
		return TabMap[i][j];
	}

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	
	/*private void setTabLine(String line, int nb) {
		this.TabLine[nb] = line;
		this.setChanged();
		this.notifyObservers();
	}*/

	/**
     * Load Map.
     *
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMap(int map) {
		setLevel(map);
		try {
			final DAOMap daoLine = new DAOMap(DBConnection.getInstance().getConnection());
		for(int i = 0; i < 22; i++) {
				TabLine[i] = daoLine.find(i + 1, map);
				}
		splitTab(TabLine);
		instanceObject(TabMap);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		this.setChanged();
		this.notifyObservers();
	}
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public void setPosition(int i) {
		swap(TabEntity, Map, i);
	}
	
	public void swap(Entity[][] tabEntity, Image[][] tabImage, int i) {
		Entity entity;
		Image image;
		Boolean move = false;
		for(int y = 0; y < 22; y++) {
			for(int x = 0; x < 40; x++) {
				if(tabEntity[y][x] instanceof Character) {
					move = true;
					switch(i) {
						case 38:
							entity = tabEntity[y][x];
							tabEntity[y][x] = tabEntity[y-1][x];
							tabEntity[y-1][x] = entity;
							image = tabImage[y][x];
							tabImage[y][x] = tabImage[y-1][x];
							tabImage[y-1][x] = image;
							break;
						case 40:
							entity = tabEntity[y][x];
							tabEntity[y][x] = tabEntity[y+1][x];
							tabEntity[y+1][x] = entity;
							image = tabImage[y][x];
							tabImage[y][x] = tabImage[y+1][x];
							tabImage[y+1][x] = image;
							break;
						case 39:
							entity = tabEntity[y][x];
							tabEntity[y][x] = tabEntity[y][x+1];
							tabEntity[y][x+1] = entity;
							image = tabImage[y][x];
							tabImage[y][x] = tabImage[y][x+1];
							tabImage[y][x+1] = image;
							break;
						case 37:
							entity = tabEntity[y][x];
							tabEntity[y][x] = tabEntity[y][x-1];
							tabEntity[y][x-1] = entity;
							image = tabImage[y][x];
							tabImage[y][x] = tabImage[y][x-1];
							tabImage[y][x-1] = image;
					}
					this.setChanged();
					this.notifyObservers();
				}
				if(move == true)
					break;
			}
			if(move == true)
				break;
		}
	}

	/**
	 * instanceObject
	 * 
	 * The function instanceObject instance Object and load the Image in the array Map[][].
	 * 
	 * @param tabMap
	 * 			The parameter tabMap is used to create Object depending on the letter it contains.
	 * 
	 */
	public void instanceObject(String[][] tabMap ) {
		int Y = 20;
		for(int i = 0; i < 22; i++) {
			for(int j = 0; j < 40; j++) {
				switch(tabMap[i][j]) {
				case "M":
					this.wall = new Wall(10 + (i * 32), Y);
					TabEntity[i][j] = this.wall;
					Map[i][j] = this.wall.getSpritePath();
					break;
				case "T":
					this.dirt = new Dirt(10 + (i * 32), Y);
					TabEntity[i][j] = this.dirt;
					Map[i][j] = this.dirt.getSpritePath();
					break;
				case "D":
					this.diamond = new Diamond(10 + (i * 32), Y);
					TabEntity[i][j] = this.diamond;
					Map[i][j] = this.diamond.getSpritePath();
					break;
				case "C":
					this.boulder = new Boulder(10 + (i * 32), Y);
					TabEntity[i][j] = this.boulder;
					Map[i][j] = this.boulder.getSpritePath();
					break;
				case "E":
					this.door = new Door(10 + (i * 32), Y);
					TabEntity[i][j] = this.door;
					Map[i][j] = this.door.getSpritePath();
					break;
				case "P":
					this.character = new Character(10 + (i*32), Y);
					TabEntity[i][j] = this.character;
					Map[i][j] = this.character.getSpritePath();
					break;
				default:
					System.out.println("Error");
				}
			}
			Y += 32;
		}
	}
	/**
	 * getMap 
	 * 		Send the image of the Map.
	 * 
	 * @param i
	 * 			This is the horizontal position in the array.
	 * @param j
	 * 			This is the vertical position in the array.
	 * 
	 */
	public Image getMap(int i, int j) {
		return Map[i][j];
	}
	
	public Entity[][] getTabEntity() {
		return TabEntity;
	}
	
	public Image[][] getMap(){
		return Map;
	}
	
	public void splitTab(String[] tab) {
		String a;
		for(int i = 0; i < 22 ; i++) {
			a = tab[i];
			TabLine2 = a.split("");
			for(int j = 0; j < 40; j++) {
				TabMap[i][j] = TabLine2[j];
			}
		}
	}
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
}
