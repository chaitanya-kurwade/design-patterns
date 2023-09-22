package com.codewithmosh.A_Behavioral.f_command.ex2;

public class OpenDoc implements ActionListenerCommand{

	private DocumentOpenSave documentOpen;
	public OpenDoc(DocumentOpenSave documentOpen) {
		this.documentOpen = documentOpen;
	}
	@Override
	public void execute() {
		documentOpen.open();
	}
	
}
