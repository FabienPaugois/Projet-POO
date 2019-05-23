package model;

/**
 * The Class Player.
 *
 * @author Hugo
 */
public class Map {
	private int Width;
	private int Height;
	protected String componant[];

	/**
	 * 
	 * @return The Map Width 
	 */
	public int getWidth() {
		return Width;
	}
	
	/**
	 * 
	 * @param width the Width position
	 * 			
	 */
	public void setWidth(int width) {
		Width = width;
	}
	
	/**
	 * 
	 * @return the Map Height
	 */
	public int getHeight() {
		return Height;
	}
	
	/**
	 * 
	 * @param height The Height position
	 */
	public void setHeight(int height) {
		Height = height;
	}

}
