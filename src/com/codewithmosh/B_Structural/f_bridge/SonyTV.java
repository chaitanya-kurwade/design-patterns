package com.codewithmosh.B_Structural.f_bridge;

public class SonyTV implements Device{

	@Override
	public void turnOn() {
		System.out.println("Sony: turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony: turnOff");
		
	}

	@Override
	public void setCHannel() {
		System.out.println("Sony: setChannel");
	}
}

