package com.codewithmosh.A_Behavioral.f_command.ex4;

public class Main {

	public static void main(String[] args) {
	
		Stock stock = new Stock("ABC", 10);
		
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
		Broker broker = new Broker();
		
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrder();
		
		
	}
}
