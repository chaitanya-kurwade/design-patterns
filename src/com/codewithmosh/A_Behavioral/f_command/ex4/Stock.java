package com.codewithmosh.A_Behavioral.f_command.ex4;

public class Stock {

	private String nameOfStock;
	private int quantity;
	
	public Stock(String nameOfStock, int quantity) {
		this.nameOfStock = nameOfStock;
		this.quantity = quantity;
	}
	
	public void buyStock() {
		System.out.println(
				"Name: "+nameOfStock+", Quantity: "+quantity+" bought!"
				);
	}
	
	public void sellStock() {
		System.out.println(
				"Name: "+nameOfStock+", Quantity: "+quantity+" sold!"
				);
	}
	
}
