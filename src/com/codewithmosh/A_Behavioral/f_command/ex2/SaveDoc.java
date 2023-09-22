package com.codewithmosh.A_Behavioral.f_command.ex2;

public class SaveDoc implements ActionListenerCommand{

	private DocumentOpenSave documentSave;
	
	public SaveDoc(DocumentOpenSave documentSave){
		this.documentSave = documentSave;
	}
	@Override
	public void execute() {
		documentSave.save();
	}

}
