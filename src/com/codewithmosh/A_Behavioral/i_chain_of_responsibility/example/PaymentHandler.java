package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.example;

public abstract class PaymentHandler {

	protected PaymentHandler next;
	
	public void setNext(PaymentHandler next) {
		this.next = next;
	}
	
	public abstract void handlePayment(double amount);
	
}
