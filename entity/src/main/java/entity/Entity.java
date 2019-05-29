package entity;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * * @author rodri
 *
 */
public abstract class Entity {

	/** The Boolean ismovable */

	public boolean isMovable;

	/** The Boolean canbepushed */

	public boolean canBePushed;

	/* The Boolean canbedestroyed */

	public void setCanBePushed(boolean canBePushed) {
		this.canBePushed = canBePushed;
	}

	public boolean canBeDestroyed;

	/** Horizontal position of the Entity */
	public int posX = 0;

	/** Vertical position of the Entity */

	public int posY = 0;

	/** Load of the sprite */

	protected Image spritePath;
	
	protected Boolean falling;

	public Boolean getFalling() {
		return falling;
	}

	public void setFalling(Boolean falling) {
		this.falling = falling;
	}

	/**
	 * 
	 * 
	 * @return the Image
	 */

	public Image getSpritePath() {
		return spritePath;
	}

	public boolean getIsMovable() {
		return isMovable;
	}

	public boolean getCanBePushed() {
		return canBePushed;
	}

	public boolean getCanBeDestroyed() {
		return canBeDestroyed;
	}

}
