package com.codewithmosh.A_Behavioral.f_command.example2;

public class CarStopped  implements CarStartStop{

	private  Car car;
	
	public CarStopped(Car car) {
		this.car=car;
	}

	@Override
	public void key() {
		car.stoppedByKey();
	}	
}
