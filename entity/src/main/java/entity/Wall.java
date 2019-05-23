package entity;

/**
 * The Class Wall
 *
 * @author Fabien Paugois
 */
public class Wall extends Entity {

	/**
	 * Instantiates a new Wall.
	 *
	 * @param X
	 *          The X (horizontal) position of the Wall object.
	 * @param Y
	 *          The Y (vertical) position of the Wall object.
	 * @param Breakable
	 *          Is the Wall breakable ?
	 * @param Falling
	 *          Is the Wall falling ?
	 * @param Pushable
	 *          Can the Wall be pushed ?
	 */
	public Wall(int X, int Y, boolean Breakable, boolean Falling, boolean Pushable) {
		this.setX(X);
		this.setY(Y);
		this.setBreakable(Breakable);
		this.setFalling(Falling);
		this.setPushable(Pushable);
	}

}
