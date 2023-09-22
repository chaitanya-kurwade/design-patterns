package com.codewithmosh.A_Behavioral.f_command.ex2;

public class Main {

	public static void main(String[] args) {
		
		DocumentOpenSave documentOpenSave = new DocumentOpenSave("Hello.java");
		OpenDoc doc = new OpenDoc(documentOpenSave);
		doc.execute();
		
		SaveDoc doc2 = new SaveDoc(documentOpenSave);
		doc2.execute();
	}
}
