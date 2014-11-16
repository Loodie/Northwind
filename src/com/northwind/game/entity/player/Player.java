package com.northwind.game.entity.player;

import com.northwind.game.entity.Entity;
import com.northwind.game.map.Position;


/**
 * The player of the game
 * 
 * @author Ludwig
 */
public class Player extends Entity {
	
	/** The player's level */
	private int level = 1;
	
	/** The experience of the player */
	private int experience;
	
	/** The experience required to level up */
	private int requiredExperience = 100;
	
	/**
	 * The player's levels
	 */
	private Stats stats;
	
	/**
	 * Creates a Player
	 * 
	 * @param name
	 * 		The name of the new Player
	 */
	public Player(String name) {
		super("/res/character.png", Position.getStartingPosition(), name, "What an ugly player.");
		stats = new Stats();
	}
	
	/**
	 * Getter for the player's level
	 * 
	 * @return
	 * 		The player's level
	 */
	public int getLevel() {
		return level;
	}	

	/**
	 * Getter for the player's experience
	 * 
	 * @return
	 * 		The player's experience
	 */
	public int getExperience() {
		return experience;
	}
	
	/**
	 * Getter for the required experience to level up
	 * 
	 * @return
	 * 		The required experience
	 */
	public int getRequiredExperience() {
		return requiredExperience;
	}
	
	/** Increase the level of the player */
	public void levelUp() {
		level++;
		requiredExperience *= 1.1;
	}
	
	/**
	 * Add experience to the player
	 * 
	 * @param experience
	 * 		The amount of experience to add
	 */
	public void addExperience(int experience) {
		this.experience += experience;
		while(experience >= requiredExperience) {
			levelUp();
		}
 	}
	
	/**
	 * Gets the player's stats.
	 * 
	 * @return The player's stats.
	 */
	public Stats getStats() {
		return stats;	
	}

}