package com.codewithmosh.A_Behavioral.f_command.ex2;

public class DocumentOpenSave {

	private String document;
	public DocumentOpenSave(String document) {
		this.document = document;
	}
	public void save() {
		System.out.println("Saved: "+document);
	}

	public void open() {
		System.out.println("Opend: "+document);
	}
}
