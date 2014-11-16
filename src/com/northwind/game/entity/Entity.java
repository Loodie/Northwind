package com.northwind.game.entity;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.northwind.game.map.Position;

/**
 * A parent class for Player and NPC
 * 
 * @author Ludwig
 */
public abstract class Entity {
	
	/** The Image representing the Entity */
	private Image image;
	
	/** The position of the Entity */
	private Position position;
	
	/** The name of the Entity */
	private String name;
	
	/** The description of the Entity */
	private String description;
	
	/**
	 * Creates a new Entity
	 * 
	 * @param
	 * 		The path to the image representing the Entity
	 * @param position
	 * 		The position of the Entity
	 * @param name
	 * 		The name of the Entity
	 * @param description
	 * 		The description of the Entity
	 */
	public Entity(String imagePath, Position position, String name, String description) {
		try {
			image = ImageIO.read(Entity.class.getResource(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.position = position;
		this.name = name;
		this.description = description;
	}
	
	public void render(Graphics g) {
		g.drawImage(image, position.getX(), position.getY(), null);
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