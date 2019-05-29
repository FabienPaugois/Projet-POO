package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Boulder extends Entity{
	
	public int getBoulderX() {
		return posX;
	}
	
	public int getBoulderY() {
		return posY;
	}
	
	/**
	 * Constructor of the Boulder class initializes the parameters of the Boulder.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the Boulder is movable or not
	 *  define if the Boulder is destructible or not
	 *  define if the Boulder can be pushed or not
	 *  give the path to sprite of the Boulder
	 */
	public Boulder(int X, int Y) {
		this.isMovable = true;
		this.canBeDestroyed = false;
		this.canBePushed = false;
		try {
		this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/rock.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		this.posX = X;
		this.posY = Y;
	}
}
