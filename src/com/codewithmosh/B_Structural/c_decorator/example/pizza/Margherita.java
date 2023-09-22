package com.codewithmosh.B_Structural.c_decorator.example.pizza;

public class Margherita implements BasePizza{

	@Override
	public int cost() {
		int margheritaCost = 180;
		System.out.println("Preparing Margherita:\t\t"+margheritaCost);
		return margheritaCost;
	}

}
