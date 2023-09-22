package com.codewithmosh.A_Behavioral.a_momento;

import java.util.ArrayList;
import java.util.List;


//care taker
public class History {

	private List<EditorState> states = new ArrayList<>();

	public void push(EditorState state) {
		states.add(state);
	}

	public EditorState pop() {
		var lastIndex = states.size()-1;
		var lastState = states.get(lastIndex);
		states.remove(lastState);
		return lastState;
	}
}
