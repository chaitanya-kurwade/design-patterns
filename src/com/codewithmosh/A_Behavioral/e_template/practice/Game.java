package com.codewithmosh.A_Behavioral.e_template.practice;

public abstract class Game {

	private Ground ground;
	public Game() {
		ground = new Ground();
	}
	
	
	public Game(Ground ground) {
		this.ground = ground;
	}
	
	
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   public final void play(){
		  ground.ground();
	      
		  initialize();
	      startPlay();
	      endPlay();
	   }
	
}
