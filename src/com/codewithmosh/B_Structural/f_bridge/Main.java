package com.codewithmosh.B_Structural.f_bridge;

public class Main {

	public static void main(String[] args) {
		var control = new AdvancedRemoteControl(new SonyTV());
		control.turnOn();
		control.setChannel(12);
		control.turnOff();
	}

}
