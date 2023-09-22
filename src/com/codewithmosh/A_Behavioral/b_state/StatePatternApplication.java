package com.codewithmosh.A_Behavioral.b_state;

public class StatePatternApplication {
	public static void main(String[] args) {
		// State pattern --> to change the state of any particular thing
		var canvas = new Canvas();
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();
				
		canvas.setCurrentTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
