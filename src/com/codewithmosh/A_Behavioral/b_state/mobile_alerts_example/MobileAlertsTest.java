package com.codewithmosh.A_Behavioral.b_state.mobile_alerts_example;

public class MobileAlertsTest {

	public static void main(String[] args) {
		MobileContext context = new MobileContext();
		
		context.nextAlert();
		context.nextAlert();
		context.nextAlert();
		context.nextAlert();
		context.nextAlert();
		System.out.println();
		System.out.println("Changing mobile alert to vibrate mode");
		context.setAlert(new Vibrate());
		context.nextAlert();
	}
}
