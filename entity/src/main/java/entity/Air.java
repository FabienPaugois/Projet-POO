package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Air extends Entity{
	
	/**
	 * Constructor of the Void class initializes the parameters of the Void.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the Air is movable or not
	 *  define if the Air is destructible or not
	 *  define if the Air can be pushed or not
	 *  give the path to sprite of the Air
	 */
	public Air(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = true;
		this.canBePushed = true;
		try {
			spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/air.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		this.posX = X;
		this.posY = Y;
	}
}
