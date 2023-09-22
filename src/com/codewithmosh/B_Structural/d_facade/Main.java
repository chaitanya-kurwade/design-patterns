package com.codewithmosh.B_Structural.d_facade;

public class Main {

	public static void main(String[] args) {

		SendNotification notification = new SendNotification();
		notification.send("Hello world!", "target");
	}

}
