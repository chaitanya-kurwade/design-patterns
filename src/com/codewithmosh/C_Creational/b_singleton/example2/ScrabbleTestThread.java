package com.codewithmosh.C_Creational.b_singleton.example2;

public class ScrabbleTestThread {

	public static void main(String[] args) {
		
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTheTiles = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTheTiles).start();
	}
	
}
