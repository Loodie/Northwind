package com.northwind;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Application {
	
	public static void main(String[] args) {
		
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle("Northwind");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		while(!Display.isCloseRequested()) {
			Display.update();
		}
		
	}	
}
