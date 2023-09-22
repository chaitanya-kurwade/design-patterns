package com.codewithmosh.B_Structural.a_composite.example;


public abstract class Product implements Box{

	protected String title;
	protected double price;
	
	Product(String title, double price){
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
