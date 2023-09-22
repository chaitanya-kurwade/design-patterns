package com.codewithmosh.A_Behavioral.f_command.ex1;

public class BoldCommand implements UndoableCommand{

	private HtmlDocument document;
	private History history;
	private String prevContent;
	
	public BoldCommand(HtmlDocument document, History history) {
		this.document = document;
		this.history = history;
	}
	
	@Override
	public void execute() {
		prevContent = document.getContent();
		document.makeBold();
		history.push(this);
	}

	@Override
	public void unexecute() {
		document.setContent(prevContent);
	}

}
