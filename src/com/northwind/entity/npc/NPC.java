package com.northwind.entity.npc;

import com.northwind.entity.Entity;
import com.northwind.map.Position;

/**
 * Any non playable character in the game
 * 
 * @author Ludwig
 */
public class Npc extends Entity {

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
	public Npc(Position position, String name, String description) {
		super(position, name, description);
	}

	/**
	 * Moves the npc
	 * 
	 * @param other
	 * 			The position
	 */
	public void move(Position other) {
		getPosition().setPosition(other);
	}
}
