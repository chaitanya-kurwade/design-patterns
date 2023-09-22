package com.codewithmosh.B_Structural.c_decorator.example.toppings;

import com.codewithmosh.B_Structural.c_decorator.example.pizza.BasePizza;

public class ExtraCheese implements Toppings{

	private BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	public int cost() {
		int cheeseCost = 20;
		System.out.println("Adding Extra cheese:\t\t"+cheeseCost);
		return this.basePizza.cost() + cheeseCost;
	}
}
