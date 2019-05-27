package entity;

import java.awt.Image;

/**
 * 
 *  * @author rodri
 *
 */
public abstract class Entity{
	
	/** The Boolean ismovable */
	
	public boolean isMovable;
	
	/** The Boolean canbepushed */
	
	public boolean canBePushed;
	
	/* The Boolean canbedestroyed */
	
	public boolean canBeDestroyed;
	
	/** Horizontal position of the Entity */
	public int posX;
	
	/** Vertical position of the Entity */
	
	public int posY;
	
	/** Load of the sprite */
	
	protected Image spritePath;

	/**
	 * 
	 * 
	 * @return
	 * 	the Image
	 */
	public Image getSpritePath() {
		return spritePath;
	}
}
