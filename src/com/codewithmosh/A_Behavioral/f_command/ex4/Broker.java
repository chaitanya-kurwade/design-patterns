package com.codewithmosh.A_Behavioral.f_command.ex4;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order > orders = new ArrayList<>();
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrder() {
		for(Order order : orders) {
			order.execute();
		}
	}
}
