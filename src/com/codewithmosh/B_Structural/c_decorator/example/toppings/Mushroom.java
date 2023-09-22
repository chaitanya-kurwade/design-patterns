package com.codewithmosh.B_Structural.c_decorator.example.toppings;

import com.codewithmosh.B_Structural.c_decorator.example.pizza.BasePizza;

public class Mushroom implements Toppings{
	private BasePizza basePizza;
	
	public Mushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		int mushroomCost=30;
		System.out.println("Adding Extra mushroom:\t\t"+mushroomCost);
		return basePizza.cost()+mushroomCost;
	}

}
