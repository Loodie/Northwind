package com.northwind.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.northwind.game.entity.player.Player;

@SuppressWarnings("serial")
public class Game extends Canvas {
	
	private Player bob;
	
	public Game() {
		setPreferredSize(new Dimension(Constants.GAME_WIDTH, Constants.GAME_HEIGHT));
		
		bob = new Player("Bob");
	}
	
	public void update() {
		
	}
	
	public void render() {
		
		BufferStrategy bs = getBufferStrategy();
		
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		bob.render(g);
		
		g.dispose();
		bs.show();
	}
	
}
