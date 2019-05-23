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
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public boolean isBreakable() {
		return Breakable;
	}
	public void setBreakable(boolean breakable) {
		Breakable = breakable;
	}
	public boolean isFalling() {
		return Falling;
	}
	public void setFalling(boolean falling) {
		Falling = falling;
	}
	public boolean isPushable() {
		return Pushable;
	}
	public void setPushable(boolean pushable) {
		Pushable = pushable;
	}
	
	
}
