package com.codewithmosh.B_Structural.b_adapter.example;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10)+1;
		System.out.println("Enemy Tank Does "+attackDamage+" Damage");
	}

	@Override
	public void driverForward() {
		int movement = generator.nextInt(5)+1;
		System.out.println("Enemy Tank moves "+movement+" spaces");
	}

	@Override
	public void assighDriver(String driverName) {
		System.out.println(driverName+" is driving thr tank");
	}

}
