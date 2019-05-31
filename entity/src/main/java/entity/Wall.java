package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall extends Entity{
	/**
	 * Constructor of the Wall class initializes the parameters of the Level's Wall.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 *  define if the wall is movable or not
	 *  define if the wall is destructible or not
	 *  define if the wall can be pushed or not
	 *  give the path to sprite of the wall
	 */
		public Wall(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = false;
		this.canBePushed = false;
		try {
			spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/wall.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
		
}
