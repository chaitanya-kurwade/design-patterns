package com.codewithmosh.A_Behavioral.e_template.example;

public class VegPizza extends PizzaShopTemplate {

	@Override
	protected void selectBread() {
		System.out.println("Selecting of bread for Veg pizza");
	}

	@Override
	protected void ingredients() {
		System.out.println("Adding ingredients in Veg pizza");
	}

}
