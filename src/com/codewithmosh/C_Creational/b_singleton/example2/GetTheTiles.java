package com.codewithmosh.C_Creational.b_singleton.example2;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance 2 ID: "+ System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());

		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 2: "+playerOneTiles);
		System.out.println("Got tiles");
		
	}

}
