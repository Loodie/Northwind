package com.northwind;

import com.northwind.entity.npc.NPC;
import com.northwind.map.Position;

public class Application {
	
	public static void main(String[] args) {
		NPC bob = new NPC(new Position(0, 0), "Bob", "x'D");
		bob.move(5, 5);
		System.out.println(bob.getPosition().toString());
	}
	
}
