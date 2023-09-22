package com.codewithmosh.B_Structural.f_bridge;

public class SamsungTV implements Device{

	@Override
	public void turnOn() {
		System.out.println("Samsung: turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung: turnOff");		
	}

	@Override
	public void setCHannel() {
		System.out.println("Samsung: setChannel");		
	}

}
