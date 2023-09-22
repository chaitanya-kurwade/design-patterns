package com.codewithmosh.A_Behavioral.f_command.example;

public class RemoteController {

	private Command command;
	
	public RemoteController(Command command) {
		this.command=command;
	}
	
	void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}

}