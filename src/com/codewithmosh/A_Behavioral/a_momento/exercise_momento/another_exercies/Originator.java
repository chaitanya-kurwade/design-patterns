package com.codewithmosh.A_Behavioral.a_momento.exercise_momento.another_exercies;

public class Originator {

	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public Momento saveStateToMomento() {
		return new Momento(state);
	}
	
	
	
	public void getStateFromMomento(Momento momento) {
		state = momento.getState();
	}
}
