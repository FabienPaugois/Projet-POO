package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Character extends Entity{
	
	
	int nbDiamond;
	
	public int getNbDiamond() {
		return nbDiamond;
	}
	
	public void setNbDiamond(int nbDiamond) {
		this.nbDiamond = nbDiamond;
	}
	/**
	 * Constructor of the Diamond class initializes the parameters of the Diamond.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the character is movable or not
	 *  define if the character is destructible or not
	 *  define if the character can be pushed or not
	 *  give the path to sprite of the character
	 */
	
	public Character(int X, int Y) {
		this.nbDiamond = 0;
		this.isMovable = true;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/Player.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
