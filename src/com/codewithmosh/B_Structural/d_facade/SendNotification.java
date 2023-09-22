package com.codewithmosh.B_Structural.d_facade;

public class SendNotification {

	public void send(String message, String target) {
		var server = new NotificationServer();
		var connecttion = server.connect("ip");
		var authenticate = server.authenticate("appId", "key");
		server.send(authenticate, new Message(message), target);
		connecttion.disconnect();
	}
}
