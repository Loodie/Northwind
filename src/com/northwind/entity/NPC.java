package com.northwind.entity;

import com.northwind.map.Position;

/**
 * Any non playable character in the game
 * 
 * @author Ludwig
 */
public class NPC extends Entity {

	/**
	 * Creates a new NPC
	 * 
	 * @param position
	 * 		The position of the new NPC
	 * @param name
	 * 		The name of the new NPC
	 * @param description
	 * 		The description of the new NPC
	 */
	public NPC(Position position, String name, String description) {
		super(position, name, description);
	}
	
}
