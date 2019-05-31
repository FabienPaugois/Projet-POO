package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Door extends Entity{
	/**
	 * Constructor of the Diamond class initializes the parameters of the Diamond.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the Door is movable or not
	 *  define if the Door is destructible or not
	 *  define if the Door can be pushed or not
	 *  give the path to sprite of the Door
	 */
	
	public Door(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/exit.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
