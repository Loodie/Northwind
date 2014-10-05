package com.northwind.game.map;


/**
 * An area in the game
 * 
 * @author Ludwig
 */

public class Area {
	
	/** The top left position of the area */
	private Position topLeft;
	
	/** The bottom right position of the area */
	private Position bottomRight;
	
	/**
	 * Creates a new Area
	 * 
	 * @param topLeft
	 * 		The top left position of the area
	 * @param bottomRight
	 * 		The bottom right position of the area
	 */
	public Area(Position topLeft, Position bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	/**
	 * Find out if the area contains a specified position
	 * 
	 * @param p
	 * 		The Position to check
	 * @return
	 * 		If the Position is inside the area
	 */
	public boolean containsPosition(Position p) {
		boolean containsX = p.getX() >= topLeft.getX() 
				&& p.getX() <= bottomRight.getX(); //Contains the x-coordinate of the position
		boolean containsY = p.getY() >= topLeft.getY() 
				&& p.getY() <= bottomRight.getY(); //Contains the y-coordinate of the position
		return containsX && containsY;
	}
	
}
