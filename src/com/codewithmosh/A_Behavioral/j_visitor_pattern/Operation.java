package com.codewithmosh.A_Behavioral.j_visitor_pattern;
//visitor
public interface Operation {

	void apply(HeadingNode heading);
	void apply(AnchorNode anchor);
	
}
