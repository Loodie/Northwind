package com.northwind.game.entity.player;

import com.northwind.game.skills.Skill;

public class Stats {
	
	private int statpoints;
	
	private int[] stats;
	
	/**
	 * Creates a new level instance. All this does is allocate memory for the backing array.
	 */
	public Stats() {
		stats = new int[Skill.values().length];
		statpoints = 0;
	}
	
	/**
	 * Adds a specified amount of statpoints.
	 * 
	 * @param amount The amount to add.
	 */
	public void addStatpoints(int amount) {
		statpoints += amount;
	}
	
	/**
	 * Increments the level of a skill by one.
	 * 
	 * @param skill The {@link Skill} to increment.
	 * @return True if successfully incremented, false if the player has not enough statpoints.
	 */
	public boolean addLevel(Skill skill) {
		if(statpoints > 0) {
			stats[skill.ordinal()] += 1;
			statpoints--;
			return true;
		}
		return false;
	}
	
	/**
	 * Sets the level of a skill to the specified value.
	 * 
	 * NOTE: This SKIPS the statpoint checking, and should only be used for loading.
	 * 
	 * @param skill The {@link Skill} to set the level of.
	 * @param level The level to set it to.
	 */
	@SuppressWarnings("unused")
	private void setLevel(Skill skill, int level) {
		stats[skill.ordinal()] = level;
	}
	
	/**
	 * Gets the level of a skill.
	 * 
	 * @param skill The {@link Skill} to get the level of.
	 * @return The level of the skill
	 */
	public int getLevel(Skill skill) {
		return stats[skill.ordinal()];
	}
}