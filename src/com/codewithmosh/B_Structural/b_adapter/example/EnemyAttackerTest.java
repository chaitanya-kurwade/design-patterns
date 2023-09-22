package com.codewithmosh.B_Structural.b_adapter.example;

public class EnemyAttackerTest {

	public static void main(String[] args) {
		EnemyTank enemyTank = new EnemyTank();
		
		EnemyRobot enemyRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);
		
		System.out.println("The robot");
		
		enemyRobot.ractToHuman("Paul");
		enemyRobot.walkForward();
		enemyRobot.smashWithHands();
		System.out.println();
		
		System.out.println("The enemy tank");
		enemyTank.assighDriver("Frank");
		enemyTank.driverForward();
		enemyTank.fireWeapon();
		System.out.println();
		
		System.out.println("The robot with adapter");
		robotAdapter.assighDriver("Mark");
		robotAdapter.driverForward();
		robotAdapter.fireWeapon();
	}
}

