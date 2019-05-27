package entity;

import java.io.File;
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
	 */
	
	public Door(int X, int Y) {
		this.isMovable = true;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(new File("C:\\Users\\rodri\\Desktop\\Projet java\\Sprite\\Sprites\\exit.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}
