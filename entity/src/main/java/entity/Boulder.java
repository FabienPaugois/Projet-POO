package entity;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Boulder extends Entity{
	
	/**
	 * Constructor of the Boulder class initializes the parameters of the Boulder.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 */
	public Boulder(int X, int Y) {
		this.isMovable = true;
		this.canBeDestroyed = false;
		this.canBePushed = true;
		try {
		this.spritePath = ImageIO.read(new File("C:\\Users\\rodri\\Desktop\\Projet java\\Sprite\\Sprites\\rock.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		this.posX = X;
		this.posY = Y;
	}
}
