 package com.codewithmosh.A_Behavioral.i_chain_of_responsibility;

public class WebServer {

	private Handler handler;
	
	public WebServer(Handler handler) {
		this.handler = handler;
	}
	
	public void handle(HttpRequest request) {
		handler.handle(request);
	}
}
