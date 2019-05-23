package entity;

/**
 * The Class Diamond
 *
 * @author Fabien Paugois
 */
public class Diamond extends Entity {

	/**
	 * Instantiates a new Diamond.
	 *
	 * @param X
	 *          The X (horizontal) position of the Diamond object.
	 * @param Y
	 *          The Y (vertical) position of the Diamond object.
	 * @param Breakable
	 *          Is the Diamond breakable ?
	 * @param Falling
	 *          Is the Diamond falling ?
	 * @param Pushable
	 *          Can the Diamond be pushed ?
	 */
	public Diamond(int X, int Y, boolean Breakable, boolean Falling, boolean Pushable) {
		this.setX(X);
		this.setY(Y);
		this.setBreakable(Breakable);
		this.setFalling(Falling);
		this.setPushable(Pushable);
	}

}
