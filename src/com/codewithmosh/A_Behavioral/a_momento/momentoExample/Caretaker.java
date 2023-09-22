package com.codewithmosh.A_Behavioral.a_momento.momentoExample;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Momento> momentoList = new ArrayList<>();
	
	public void addMomento(Momento momento) {
		this.momentoList.add(momento);
	}
	
	public Momento getMomento(int index) {
		return this.momentoList.get(index);
	}

}
