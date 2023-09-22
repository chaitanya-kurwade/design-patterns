package com.codewithmosh.A_Behavioral.a_momento.browserExample;

import java.util.ArrayList;
import java.util.List;

//caretaker
public class BrowserHistory {

	private List<BrowserState> browserStateList = new ArrayList<>();
	
	public void push(BrowserState browserState) {
		browserStateList.add(browserState);
	}
	
	public BrowserState pop() {
		var lastIndex = browserStateList.size()-1;
		var lastState = browserStateList.get(lastIndex);
		browserStateList.remove(lastState);
		return lastState;
	}
}
