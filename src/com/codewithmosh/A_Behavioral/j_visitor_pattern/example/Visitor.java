package com.codewithmosh.A_Behavioral.j_visitor_pattern.example;

public interface Visitor {

	public double visit(Liquor liquorItem);
	public double visit(Tobacco tobaccoItem);
	public double visit(Necessity necessityItem);
	
}
