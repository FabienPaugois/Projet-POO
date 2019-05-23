package model;

/**
 * The Class Player.
 *
 * @author Hugo
 */
public class Player {
	private int XPlayer;
	private int YPlayer;
	private int nbdiamont;
	private boolean Dead;
	
	/**
	 * 
	 * @return The XPlayer position
	 */
	public int getXPlayer() {
		return XPlayer;
	}
	
	/**
	 * 
	 * @param x
	 * 			the XPlayer position
	 */
	public void setXPlayer(int x) {
		XPlayer = x;
	}
	
	/**
	 * 
	 * @return the YPlayer position
	 */
	public int getYPlayer() {
		return YPlayer;
	}
	
	/**
	 * 
	 * @param y The YPlayer position
	 */
	public void setYPlayer(int y) {
		YPlayer = y;
	}

	/**
	 * 
	 * @return the nbdiamont number
	 */
	public int getNbDiamont() {
		return nbdiamont;
	}
	
	/**
	 * 
	 * @param nb The nbdiamont number
	 * 
	 */
	public void getNbDiamont(int nb) {
		nbdiamont = nb;
	}
	
	/**
	 * 
	 * @return the dead state
	 */
	public boolean isDead() {
		return Dead;
	}
	
	/**
	 * 
	 * @param dead Is the object dead ?
	 */
	public void setDead(boolean dead) {
		Dead = dead;
	}
}
