package entity;

import java.io.File;
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
	 */
	public Dirt(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(new File("C:\\Users\\rodri\\Desktop\\Projet java\\Sprite\\Sprites\\dirt.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
