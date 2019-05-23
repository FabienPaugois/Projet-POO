package entity;

/**
 * The Class Rock
 *
 * @author Fabien Paugois
 */
public class Rock extends Entity {

	/**
	 * Instantiates a new Rock.
	 *
	 * @param X
	 *          The X (horizontal) position of the Rock object.
	 * @param Y
	 *          The Y (vertical) position of the Rock object.
	 * @param Breakable
	 *          Is the Rock breakable ?
	 * @param Falling
	 *          Is the Rock falling ?
	 * @param Pushable
	 *          Can the Rock be pushed ?
	 */
	public Rock(int X, int Y, boolean Breakable, boolean Falling, boolean Pushable) {
		this.setX(X);
		this.setY(Y);
		this.setBreakable(Breakable);
		this.setFalling(Falling);
		this.setPushable(Pushable);
	}

}
