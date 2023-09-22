package com.codewithmosh.B_Structural.a_composite.example;

public class Book extends Product{

	public Book(String title, double price) {
		super(title, price);
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}
}
