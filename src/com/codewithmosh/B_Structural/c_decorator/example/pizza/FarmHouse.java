package com.codewithmosh.B_Structural.c_decorator.example.pizza;

public class FarmHouse implements BasePizza{

	@Override
	public int cost() {
		int farmHouseCost = 150;
		System.out.println("Preparing farmhouse:\t\t"+farmHouseCost);
		return farmHouseCost;
	}

}

