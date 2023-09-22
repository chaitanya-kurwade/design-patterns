package com.codewithmosh.A_Behavioral.a_momento.exercise_momento.another_exercies;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("State 1");
		caretaker.add(originator.saveStateToMomento());

		originator.setState("State 2");
		caretaker.add(originator.saveStateToMomento());
		
		originator.setState("State 3");
		caretaker.add(originator.saveStateToMomento());

		originator.setState("State 4");
		caretaker.add(originator.saveStateToMomento());
		
		originator.getStateFromMomento(caretaker.remove());
//		System.out.println(originator.getState());
		
		System.out.println("Current state: "+originator.getState());
		
		originator.getStateFromMomento(caretaker.getMomento(0));
		System.out.println("First saved state: "+originator.getState());
	}
}
