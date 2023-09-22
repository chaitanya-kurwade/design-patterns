package com.codewithmosh.A_Behavioral.e_template.example;

public class ClientMain {

	public static void main(String[] args) {
		PizzaShopTemplate template = new VegPizza();
//		template.preparePizza();
//		template.cheese();
		template.takingOrder();
//		System.out.println("\n'''''''''''''''''''''''''''''\nOrdering Non-veg pizza");
		 var template1 = new NonVegPizza();
//		 template1.preparePizza();
//		 template1.extraCheese();
//		 
		 template1.takingOrder();
		 
		 
		 
		 
	}
}
