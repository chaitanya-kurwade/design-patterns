package com.codewithmosh.A_Behavioral.j_visitor_pattern;

public class Main {

	public static void main(String[] args) {
		var document = new HtmlDocument();
		document.add(new HeadingNode());
		document.add(new AnchorNode());
		
		var operation = new PlainTextOperation();
		
		document.execute(operation);
	}
	
}
