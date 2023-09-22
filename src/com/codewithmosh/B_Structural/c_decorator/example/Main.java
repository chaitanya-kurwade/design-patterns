package com.codewithmosh.B_Structural.c_decorator.example;

import com.codewithmosh.B_Structural.c_decorator.example.pizza.FarmHouse;
import com.codewithmosh.B_Structural.c_decorator.example.pizza.Margherita;
import com.codewithmosh.B_Structural.c_decorator.example.pizza.NewPizza;
import com.codewithmosh.B_Structural.c_decorator.example.pizza.VegDelight;
import com.codewithmosh.B_Structural.c_decorator.example.toppings.ExtraCheese;
import com.codewithmosh.B_Structural.c_decorator.example.toppings.Mushroom;

public class Main {

	public static void main(String[] args) {

		NewPizza newPizza = new NewPizza();
		
		System.out.println("Total:\t\t\t\t" + newPizza.preparePizza(new Mushroom(new ExtraCheese(new Mushroom(new FarmHouse())))));
		System.out.println();
		System.out.println("Total:\t\t\t\t"+ newPizza.preparePizza(new Mushroom(new ExtraCheese(new Margherita()))));
		System.out.println();
		System.out.println("Total:\t\t\t\t"+newPizza.preparePizza(new ExtraCheese(new Mushroom(new ExtraCheese(new VegDelight())))));
		System.out.println();
		System.out.println("Total:\t\t\t\t"+newPizza.preparePizza(new Mushroom(new ExtraCheese(new FarmHouse()))));
	}
}
