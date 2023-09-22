package com.codewithmosh.B_Structural.c_decorator.example.pizza;

public class VegDelight implements BasePizza{

	@Override
	public int cost() {
		int vegDelightcost = 120;
		System.out.println("Preparing vegdelight:\t\t"+vegDelightcost);
		return vegDelightcost;
	}

}
