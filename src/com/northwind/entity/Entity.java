package com.northwind.entity;

import com.northwind.map.Position;

/**
 * A parent class for Player and NPC
 * 
 * @author Ludwig
 */
public abstract class Entity {
	
	/** The position of the Entity */
	private Position position;
	
	/** The name of the Entity */
	private String name;
	
	/** The description of the Entity */
	private String description;
	
	/**
	 * Creates a new Entity
	 * 
	 * @param position
	 * 		The position of the Entity
	 * @param name
	 * 		The name of the Entity
	 * @param description
	 * 		The description of the Entity
	 */
	public Entity(Position position, String name, String description) {
		this.position = position;
		this.name = name;
		this.description = description;
	}
	
	/**
	 * Getter for the Position of the Entity
	 * 
	 * @return
	 * 		The Position of the Entity
	 */
	public Position getPosition() {
		return position;
	}
	
	/**
	 * Getter for the x-coordinate of the Entity
	 * 
	 * @return
	 * 		The x-coordinate of the Entity
	 */
	public int getX() {
		return position.getX();
	}
	
	/**
	 * Getter for the y-coordinate of the Entity
	 * 
	 * @return
	 * 		The y-coordinate of the Entity
	 */
	public int getY() {
		return position.getY();
	}
	
	/**
	 * Getter for the name of the Entity
	 * 
	 * @return
	 * 		The name of the Entity
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for the description of the Entity
	 * 
	 * @return
	 * 		The description of the Entity
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Set the coordinates of the Entity
	 * 
	 * @param x
	 * 		The new x-coordinate for the Entity
	 * @param y
	 * 		The new y-coordinate for the Entity
	 */
	public void setCoords(int x, int y) {
		position.setX(x);
		position.setY(y);
	}
	
	/**
	 * Setter for the x-coordinate of the Entity
	 * 
	 * @param x
	 * 		The new x-coordinate for the Entity
	 */
	public void setX(int x) {
		position.setX(x);
	}
	
	/**
	 * Setter for the y-coordinate of the Entity
	 * 
	 * @param y
	 * 		The new y-coordinate for the Entity
	 */
	public void setY(int y) {
		position.setY(y);
	}
	
	/**
	 * Moves the Entity
	 * 
	 * @param x
	 * 		Length to move the entity in the x direction
	 * @param y
	 * 		Length to move the entity in the y direction
	 */
	public void move(int x, int y) {
		setX(getX() + x);
		setY(getY() + y);
	}
	
}
