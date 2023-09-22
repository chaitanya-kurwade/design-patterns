package com.codewithmosh.A_Behavioral.j_visitor_pattern;

public class PlainTextOperation implements Operation{

	@Override
	public void apply(HeadingNode heading) {
		System.out.println("text-heanding");
	}

	@Override
	public void apply(AnchorNode anchor) {
		System.out.println("text-anchor");
	}

}
