package com.northwind.entity;

import com.northwind.map.Position;


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
	
	/** Amount of stat points to spend */
	private int statPoints;
	
	/** The player's levels */
	private int attackLevel, defenseLevel, magicLevel;
	
	/**
	 * Creates a Player
	 * 
	 * @param name
	 * 		The name of the new Player
	 */
	public Player(String name) {
		super(Position.getStartingPosition(), name, "What an ugly player.");
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
	 * Getter for the player's stat points
	 * 
	 * @return
	 * 		The stat points to spend
	 */
	public int getStatPoints() {
		return statPoints;
	}
	
	/**
	 * Add the desired amount of stat points to the player
	 * 
	 * @param statPoints
	 * 		The amount of stat points to add
	 */
	public void addStatPoints(int statPoints) {
		this.statPoints += statPoints;
	}
	
	/**
	 * Getter for the player's attack level
	 * 
	 * @return
	 * 		The player's attack level
	 */
	public int getAttackLevel() {
		return attackLevel;
	}
	
	/**
	 * Getter for the player's defense level
	 * 
	 * @return
	 * 		The player's defense level
	 */
	public int getDefenseLevel() {
		return defenseLevel;
	}
	
	/**
	 * Getter for the player's magic level
	 * 
	 * @return
	 * 		The player's magic level
	 */
	public int getMagicLevel() {
		return magicLevel;
	}
	
	/** Increase the player's attack level
	 * if the player has at least one stat point */
	public void increaseAttackLevel() {
		if(statPoints >= 1) {
			statPoints--;
			attackLevel++;
		}
	}
	
	/** Increase the player's defense level
	 * if the player has at least one stat point */
	public void increaseDefenseLevel() {
		if(statPoints >= 1) {
			statPoints--;
			defenseLevel++;
		}
	}
	
	/** Increase the player's magic level
	 * if the player has at least one stat point */
	public void increaseMagicLevel() {
		if(statPoints >= 1) {
			statPoints--;
			magicLevel++;
		}
	}
	
}
