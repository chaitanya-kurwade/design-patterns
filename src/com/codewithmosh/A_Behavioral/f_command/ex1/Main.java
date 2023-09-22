package com.codewithmosh.A_Behavioral.f_command.ex1;

public class Main {
	public static void main(String[] args) {
		HtmlDocument document = new HtmlDocument();
		History history = new History();
		document.setContent("Hii");

		var bold = new BoldCommand(document, history);
		bold.execute();
		System.out.println(document.getContent());
		
		
	}
}
