package com.codewithmosh.A_Behavioral.a_momento.exercise_momento.another_exercies;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Momento> momentoList = new ArrayList<>();
	
	public void add(Momento momento) {
		momentoList.add(momento);
	}
	
	public Momento remove() {
		int latestIndex = momentoList.size()-1;
		var latestState = momentoList.get(latestIndex);
		momentoList.remove(latestIndex);
		return latestState;
	}
	
	public Momento getMomento(int index) {
		return momentoList.get(index);
	}
	
}
