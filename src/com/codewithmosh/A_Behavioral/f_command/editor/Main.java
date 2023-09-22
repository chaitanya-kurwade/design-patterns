package com.codewithmosh.A_Behavioral.f_command.editor;

public class Main {
	
	public static void main(String[] args) {
		
		History history = new History();
		var document = new HtmlDocument();
		document.setContent("Hello world");
		
		var boldCommand = new BoldCommand(document, history);
		boldCommand.execute();
		System.out.println(document.getContent());
		
		boldCommand.unexecute();
		System.out.println(document.getContent());
	
		var undoCommand = new UndoCommand(history);
		undoCommand.execute();
		System.out.println(document.getContent());
		
		var boldCommand2 = new BoldCommand(document, history);
		boldCommand2.execute();
		System.out.println(document.getContent());
		
	}
}

