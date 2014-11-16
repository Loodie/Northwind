package com.northwind.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

@SuppressWarnings("serial")
public class Game extends Canvas {
	
	public Game() {
		setPreferredSize(new Dimension(Constants.GAME_WIDTH, Constants.GAME_HEIGHT));
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
		
		g.dispose();
		bs.show();
	}
	
}
