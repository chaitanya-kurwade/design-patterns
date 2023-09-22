package com.codewithmosh.A_Behavioral.f_command.example1;

import java.util.ArrayList;
import java.util.List;

import com.codewithmosh.A_Behavioral.f_command.example1.fx.Command;

public class CompositeCommand implements Command{


	private List<Command> commands = new ArrayList<>();
	
	public void add(Command command) {
		commands.add(command);
	}
	
	public void execute() {
		for(var command : commands)
			command.execute();
	}

}
