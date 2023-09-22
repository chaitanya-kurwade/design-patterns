package com.codewithmosh.B_Structural.b_adapter.example;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}

	@Override
	public void fireWeapon() {
		enemyRobot.smashWithHands();
	}

	@Override
	public void driverForward() {
		enemyRobot.walkForward();
	}

	@Override
	public void assighDriver(String driverName) {
		enemyRobot.ractToHuman(driverName);
	}
}
