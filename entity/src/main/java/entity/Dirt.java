package entity;

/**
 * The Class HelloWorld.
 *
 * @author Fabien Paugois
 */
public class Dirt extends Entity {

	/**
	 * Instantiates a new hello world.
	 *
	 * @param X
	 *          The X (horizontal) position of the Dirt object.
	 * @param Y
	 *          The Y (vertical) position of the Dirt object.
	 * @param Breakable
	 *          Is the Dirt breakable ?
	 * @param Falling
	 *          Is the Dirt falling ?
	 * @param Pushable
	 *          Can the Dirt be pushed ?
	 */
	public Dirt(int X, int Y, boolean Breakable, boolean Falling, boolean Pushable) {
		this.setX(X);
		this.setY(Y);
		this.setBreakable(Breakable);
		this.setFalling(Falling);
		this.setPushable(Pushable);
	}

}
