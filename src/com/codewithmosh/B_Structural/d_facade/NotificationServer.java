package com.codewithmosh.B_Structural.d_facade;

public class NotificationServer {

	public Connection connect(String ipAddress) {
		return new Connection();
	}
	
	public AuthToken authenticate(String appId, String key) {
		return new AuthToken();
	}
	
	public void send(AuthToken token, Message message, String target) {
		System.out.println("Sending message");
	}
}
