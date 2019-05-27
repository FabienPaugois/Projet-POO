package entity;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Exit extends Entity{

	/** The Boolean isvisible */
	
	private boolean isvisible;
	
	/**
	 * Constructor of the Exit class initializes the parameters of the Level's Exit.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 */
	public Exit(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = false;
		this.canBePushed = false;
		this.isvisible = false;
		try {
			this.spritePath = ImageIO.read(new File("C:\\Users\\rodri\\Desktop\\Projet java\\Sprite\\wall.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
