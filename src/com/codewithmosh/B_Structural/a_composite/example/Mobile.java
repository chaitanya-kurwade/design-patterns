package com.codewithmosh.B_Structural.a_composite.example;

public class Mobile extends Product{

	Mobile(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}
}
