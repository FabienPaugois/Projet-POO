package entity;

import java.awt.Image;

/**
 * 
 * * @author Fabien
 *
 */
public abstract class Entity {

	/** The Boolean canbepushed */

	public boolean canBePushed;

	/**
	 * 
	 * @param canBePushed The boolean canBePushed
	 */

	public void setCanBePushed(boolean canBePushed) {
		this.canBePushed = canBePushed;
	}

	/* The Boolean canbedestroyed */

	public boolean canBeDestroyed;

	/** Horizontal position of the Entity */
	public int posX = 0;

	/** Vertical position of the Entity */

	public int posY = 0;

	/** Load of the sprite */

	protected Image spritePath;

	/**
	 * The boolean falling
	 */

	protected Boolean falling;

	/**
	 * 
	 * @return the boolean falling
	 */

	public Boolean getFalling() {
		return falling;
	}

	/**
	 * Sets the boolean falling
	 * 
	 * @param falling the boolean falling
	 */

	public void setFalling(Boolean falling) {
		this.falling = falling;
	}

	/**
	 * 
	 * @return the Image
	 */

	public Image getSpritePath() {
		return spritePath;
	}

	/**
	 * 
	 * @return the boolean canBePushed
	 */
	public boolean getCanBePushed() {
		return canBePushed;
	}

	/**
	 * 
	 * @return	the boolean canBeDestroyed
	 */
	
	public boolean getCanBeDestroyed() {
		return canBeDestroyed;
	}

}
