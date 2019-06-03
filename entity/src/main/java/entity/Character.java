package entity;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Character extends Entity {

	int nbDiamond;

	public int getNbDiamond() {
		return nbDiamond;
	}

	public void setNbDiamond(int nbDiamond) {
		this.nbDiamond = nbDiamond;
	}

	/**
	 * Constructor of the Diamond class initializes the parameters of the Diamond.
	 * 
	 * @param X Used to initializes the position X
	 * @param Y Used to initializes the position Y
	 * 
	 */

	public Character(int X, int Y) {
		this.nbDiamond = 0;
		try {
			this.spritePath = ImageIO.read(getClass().getResource("/SpriteEntity/Player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.posX = X;
		this.posY = Y;
	}
}
