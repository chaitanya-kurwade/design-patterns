package com.codewithmosh.A_Behavioral.f_command.ex3;

public class FileInvoker {

	private Command command;
	
	public FileInvoker(Command command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
}
