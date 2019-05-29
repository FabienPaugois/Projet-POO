package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Dirt extends Entity{
	
	/**
	 * Constructor of the Dirt class initializes the parameters of the Dirt.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the Dirt is movable or not
	 *  define if the Dirt is destructible or not
	 *  define if the Dirt can be pushed or not
	 *  give the path to sprite of the Dirt
	 */
	public Dirt(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/dirt.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
