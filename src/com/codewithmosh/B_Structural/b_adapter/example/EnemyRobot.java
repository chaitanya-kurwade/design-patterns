package com.codewithmosh.B_Structural.b_adapter.example;

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands() {
		int attackDamage = generator.nextInt(10)+1;
		System.out.println("Enemy robot "+attackDamage+" Damage with hands");
	}
	
	public void walkForward() {
		
		int movement = generator.nextInt(5)+1;
		System.out.println("Enemy Robot Walks forward "+movement+" Spaces");
		
	}
	
	public void ractToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps on "+driverName);
	}
}
