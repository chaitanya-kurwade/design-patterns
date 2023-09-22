package com.codewithmosh.A_Behavioral.f_command.ex1;

public interface UndoableCommand extends Command{

	void unexecute();
	
}
