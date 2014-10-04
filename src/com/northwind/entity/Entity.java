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
	
}