package com.codewithmosh.A_Behavioral.j_visitor_pattern;

public class AnchorNode implements HtmlNode{

	@Override
	public void execute(Operation operation) {
		operation.apply(this);		
	}

}
