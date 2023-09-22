package com.codewithmosh.A_Behavioral.g_observer.another_example;

public class Subscriber implements Observer{

	String name;
	public Subscriber(String name) {
		this.name = name;
	}
		
	public String getName(Observer observer) {	
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(String title) {
		System.out.println("Hello "+this.name+" new video uploaded: "+title);
	}

	@Override
	public Observer updateByName(String title) {
		// TODO Auto-generated method stub
		return null;
	}	
}
