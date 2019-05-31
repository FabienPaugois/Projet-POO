package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Diamond extends Entity{
	
	/**
	 * Constructor of the Diamond class initializes the parameters of the Diamond.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the diamond is movable or not
	 *  define if the diamond is destructible or not
	 *  define if the diamond can be pushed or not
	 *  give the path to sprite of the diamond
	 */
	
	public Diamond(int X, int Y) {
		this.isMovable = true;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/diamond.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
