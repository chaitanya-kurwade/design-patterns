package com.codewithmosh.A_Behavioral.e_template.example;

public class NonVegPizza extends PizzaShopTemplate {

	@Override
	protected void selectBread() {
		System.out.println("Selecting of bread for NonVeg pizza");
	}

	@Override
	protected void ingredients() {
		System.out.println("Adding ingredients in NonVeg pizza");
	}

}
