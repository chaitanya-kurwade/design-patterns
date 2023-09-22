package com.codewithmosh.A_Behavioral.f_command.example2;

public class Key {

	private CarStartStop carStart;
	
	public Key(CarStartStop carStart) {
		this.carStart = carStart;
	}
	
	protected void setCar(CarStartStop carStart) {
		this.carStart = carStart;
	}
	
	protected void rotateKey() {
		carStart.key();
	}
	
}
