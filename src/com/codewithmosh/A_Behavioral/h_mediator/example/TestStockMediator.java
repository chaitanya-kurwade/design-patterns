package com.codewithmosh.A_Behavioral.h_mediator.example;

public class TestStockMediator {
	public static void main(String[] args) {
		StockMediator mediator = new StockMediator();
		 GormanSlacks broker = new GormanSlacks(mediator);
		 JTPoorman broker2 = new JTPoorman(mediator);
		 
		 
		 broker.saleOffer("MSFT", 100);
		 broker.saleOffer("GOOG", 50);
		 
		 broker2.buyOffer("MSFT", 100);
		 broker2.saleOffer("NRG", 10);
		 
		 broker.buyOffer("NRG", 10);
		 
		 mediator.getStockOfferings();
	}
}
