package com.codewithmosh.A_Behavioral.f_command.example2;


public class CarStarted implements CarStartStop{

	private  Car car;
	
	protected CarStarted(Car car) {
		this.car=car;
	}

	@Override
	public void key() {
		car.startByKey();
	}	
}
