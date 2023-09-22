package com.codewithmosh.A_Behavioral.d_strategy.example;

public class Vehicle {

	DriveMode driveMode;
	
	public Vehicle(DriveMode driveMode) {
		this.driveMode=driveMode;
	}
	
	public void drive() {
		driveMode.drive();
	}
}
