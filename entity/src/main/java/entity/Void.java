package entity;

public class Void extends Entity{
	
	/**
	 * Constructor of the Void class initializes the parameters of the Void.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 */
	public Void(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = false;
		this.canBePushed = true;
		this.posX = X;
		this.posY = Y;
	}
}
