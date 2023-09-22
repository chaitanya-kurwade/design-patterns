package com.codewithmosh.A_Behavioral.f_command.example1.fx;

public class Button {
	private String label;
	private Command command;
	
	public Button(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
	
	public String getLabel() {
		return label;
	}
}
