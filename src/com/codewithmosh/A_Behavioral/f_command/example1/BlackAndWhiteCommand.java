package com.codewithmosh.A_Behavioral.f_command.example1;

import com.codewithmosh.A_Behavioral.f_command.example1.fx.Command;

public class BlackAndWhiteCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Black and white");
	}

}
