package com.codewithmosh.A_Behavioral.b_state.z_practice;

public class Canvas {

	private Tool currentTool;
	
	public Tool getTool() {
		return this.currentTool;
	}
	
	public void setTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
	
	public void mouseUp() {
		currentTool.mouseUp();
	}
	
	public void mouseDown() {
		currentTool.mouseDown();
	}
}
