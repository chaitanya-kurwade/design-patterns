package com.codewithmosh.A_Behavioral.A_essentials;

public class MailService {
	
	//abstraction example
	//hiding real implementation and showing essential/required data only

	public void sendMail() {
		connect(5);
		authenticate();
		//send mail
		disconnect();
		
	}
	
	private void connect(int time) {
		System.out.println("Connect");
	}
	
	private void disconnect() {
		System.out.println("Disconnect");
	}
	
	private void authenticate() {
		System.out.println("Authenticate");
	}
	
	
	public static void main(String[] args) {
		//	Abstraction example
		MailService mailService = new MailService();
		mailService.sendMail();
	}
}
