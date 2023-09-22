package com.codewithmosh.A_Behavioral.f_command.example;

public class TubeLightOffCommand implements Command{

	private TubeLight light;
	
	TubeLightOffCommand(TubeLight light){
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.switchOff();
	}

}