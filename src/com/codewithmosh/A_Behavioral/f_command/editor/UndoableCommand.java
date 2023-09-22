package com.codewithmosh.A_Behavioral.f_command.editor;

public interface UndoableCommand extends Command{

	void unexecute();
	
}
