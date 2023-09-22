package com.codewithmosh.A_Behavioral.i_chain_of_responsibility;

public class Encryption extends Handler{

	public Encryption(Handler next) {
		super(next);
	}

	@Override
	public boolean doHandle(HttpRequest request) {
		System.out.println("Encryption");
		return false;
	}

}
