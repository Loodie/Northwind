package com.northwind.map;

/**
 * A position in the game
 * 
 * @author Ludwig
 */

public class Position {
	
	/**
	 * Getter for the starting position
	 * 
	 * @return
	 * 		The starting Position of a Player
	 */
	public static Position getStartingPosition() {
		return new Position(25, 25);
	}
	
	/** The x-coordinate of the position */
	private int x;
	
	/** The y-coordinate of the position */
	private int y;
	
	/**
	 * Create a new position
	 *
	 * @param x
	 * 		The x-coordinate of the position
	 * @param y
	 * 		The y-coordinate of the position
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x: " + getX() + ", y: " + getY();
	}
	
	/**
	 * Getter for the x-coordinate
	 * 
	 * @return
	 * 		The x-coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter for the y-coordinate
	 * 
	 * @return
	 * 		The y-coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter for the x-coordinate
	 * 
	 * @param x
	 * 		The new x-coordinate for the position
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Setter for the y-coordinate
	 * 
	 * @param y
	 * 		The new y-coordinate for the position
	 */
	public void setY(int y) {
		this.y = y;
	}
}