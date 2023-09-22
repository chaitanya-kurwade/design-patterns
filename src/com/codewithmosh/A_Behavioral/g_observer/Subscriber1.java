package com.codewithmosh.A_Behavioral.g_observer;

public class Subscriber1 implements Observer{

	@Override
	public String update(String msg) {
		// TODO Auto-generated method stub
		return "User 1: "+msg;
	}

}
