package entity;

/**
 * The Class HelloWorld.
 *
 * @author Fabien Paugois
 */
public class Air extends Entity {

	/**
	 * Instantiates a new hello world.
	 *
	 * @param X
	 *          The X (horizontal) position of the Air object.
	 * @param Y
	 *          The Y (vertical) position of the Air object.
	 * @param Breakable
	 *          Is the Air breakable ?
	 * @param Falling
	 *          Is the Air falling ?
	 * @param Pushable
	 *          Can the Air be pushed ?
	 */
	public Air(int X, int Y, boolean Breakable, boolean Falling, boolean Pushable) {
		this.setX(X);
		this.setY(Y);
		this.setBreakable(Breakable);
		this.setFalling(Falling);
		this.setPushable(Pushable);
	}

}
