package com.codewithmosh.A_Behavioral.d_strategy.example;

public class GoodsVehicleMode extends Vehicle{

		GoodsVehicleMode() {
			super(new NormalDriveMode());
		}
	
}
