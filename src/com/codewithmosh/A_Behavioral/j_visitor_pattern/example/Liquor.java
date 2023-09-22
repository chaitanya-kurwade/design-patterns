package com.codewithmosh.A_Behavioral.j_visitor_pattern.example;

public class Liquor implements Visitable{

	private double price;
	
	public Liquor(double item) {
		// TODO Auto-generated constructor stub
		price = item;
	}
	
	public double getPrice(){
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}
