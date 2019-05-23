package entity;

/**
 * The Abstract Class Entity.
 *
 * @author Fabien Paugois
 */
public abstract class Entity {
	protected int X;
	protected int Y;
	protected boolean Breakable;
	protected boolean Falling;
	protected boolean Pushable;
	
	/**
	 * 
	 * @return The X position
	 */
	public int getX() {
		return X;
	}
	
	/**
	 * 
	 * @param x
	 * 			the X position
	 */
	public void setX(int x) {
		X = x;
	}
	
	/**
	 * 
	 * @return the Y position
	 */
	public int getY() {
		return Y;
	}
	
	/**
	 * 
	 * @param y The Y position
	 */
	public void setY(int y) {
		Y = y;
	}
	
	/**
	 * 
	 * @return the boolean value of the Breakable attribute
	 */
	public boolean isBreakable() {
		return Breakable;
	}
	
	/**
	 * 
	 * @param breakable Is the object breakable ?
	 * 
	 */
	public void setBreakable(boolean breakable) {
		Breakable = breakable;
	}
	
	/**
	 * 
	 * @return the falling state
	 */
	public boolean isFalling() {
		return Falling;
	}
	
	/**
	 * 
	 * @param falling Is the object falling ?
	 */
	public void setFalling(boolean falling) {
		Falling = falling;
	}
	
	/**
	 * 
	 * @return the boolean value of the Pushable attribute
	 */
	public boolean isPushable() {
		return Pushable;
	}
	
	/**
	 * 
	 * @param pushable Is the object pushable ?
	 */
	public void setPushable(boolean pushable) {
		Pushable = pushable;
	}
	
}
