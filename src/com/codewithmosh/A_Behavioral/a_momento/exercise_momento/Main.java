package com.codewithmosh.A_Behavioral.a_momento.exercise_momento;

public class Main {

    public static void main(String[] args) {
    	Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setState("State 1");
    	careTaker.add(originator.saveStateToMomento());
    	System.out.println(originator.getState());
    	
    	originator.setState("State 2");
    	originator.setState("State 3");
    	careTaker.add(originator.saveStateToMomento());
    	System.out.println(originator.getState());
    	
    	
	}
}
