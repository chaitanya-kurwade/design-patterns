  package com.codewithmosh.A_Behavioral.a_momento.momentoExample;

public class MomentoApp {

	public static void main(String[] args) {
		
		var originator = new Originator();
		var caretaker = new Caretaker();
		
		originator.setState("State 1");
		caretaker.addMomento(originator.saveStateToMomento());
		originator.getStateFromMomento(caretaker.getMomento(0));
		
		originator.setState("State 2");
		caretaker.addMomento(originator.saveStateToMomento());
		originator.getStateFromMomento(caretaker.getMomento(1));
		
		originator.setState("State 3");
		caretaker.addMomento(originator.saveStateToMomento());
		originator.getStateFromMomento(caretaker.getMomento(2));
		
		originator.setState("State 4");
		caretaker.addMomento(originator.saveStateToMomento());
		originator.getStateFromMomento(caretaker.getMomento(3));
		
		System.out.println("Latest state: "+originator.getState());
	}
	
}
