package com.northwind.game;

import javax.swing.JFrame;

public class Main {
	
	private static Game game;
	
	private static void initUI() {
		JFrame frame = new JFrame();
		
		frame.setTitle(Constants.GAME_NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		frame.add(game);
		frame.pack();
		
		frame.setVisible(true);
	}
	
	/**
	 * The entry point of the application
	 * 
	 * @param args
	 * 		The command line arguments
	 */
	public static void main(String[] args) {
		
		game = new Game();
		initUI(); //Create the window
		
		int timePerFrame = 1000 / Constants.FPS_CAP; //How long each frame should take
		
		while(true) {
			
			long start = System.currentTimeMillis(); //Time when loop started
			
			game.update();
			game.render();
			
			long end = System.currentTimeMillis(); //Time when loop ended
			
			long sleepTime = timePerFrame - (end - start); //Time to sleep so that each frame takes as long as it should
			
			try {
				if(sleepTime > 0) {
					Thread.sleep(sleepTime);
				}
				else {
					Thread.yield(); //No sleep time was required
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
