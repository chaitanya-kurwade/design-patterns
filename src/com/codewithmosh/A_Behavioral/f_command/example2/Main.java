package com.codewithmosh.A_Behavioral.f_command.example2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		CarStarted carStarted = new CarStarted(car);
		Key key = new Key(carStarted);
		key.rotateKey();
				
		CarStopped carStopped = new CarStopped(car);
		Key key2 = new Key(carStopped);
		key2.rotateKey();
	}
}
