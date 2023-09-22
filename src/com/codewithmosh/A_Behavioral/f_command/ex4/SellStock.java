package com.codewithmosh.A_Behavioral.f_command.ex4;

public class SellStock implements Order{

	private Stock stock;
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		this.stock.sellStock();		
	}

}
