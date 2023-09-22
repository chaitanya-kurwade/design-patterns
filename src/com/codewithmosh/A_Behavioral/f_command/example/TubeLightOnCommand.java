package com.codewithmosh.A_Behavioral.f_command.example;

public class TubeLightOnCommand implements Command{

private TubeLight light;
	
	TubeLightOnCommand(TubeLight light){
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.switchOn();
	}
}
