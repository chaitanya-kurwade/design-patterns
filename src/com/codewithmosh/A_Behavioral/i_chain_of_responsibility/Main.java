package com.codewithmosh.A_Behavioral.i_chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		var encryption = new Encryption(null);
		var compressor = new Compressor(encryption);
		var logger = new Logger(compressor);
		var authenticator = new Authenticator(logger);
		var webServer = new WebServer(authenticator);
		webServer.handle(new HttpRequest("admin", "1234"));
	}
}
