package com.codewithmosh.A_Behavioral.d_strategy.example;

public class OffRoadMode extends Vehicle{

	OffRoadMode() {
		super(new SportsDriveMode());
	}
}
