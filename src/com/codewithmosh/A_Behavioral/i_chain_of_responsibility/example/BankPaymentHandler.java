package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.example;

public class BankPaymentHandler  extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		if(amount <= 500) {
			System.out.println("Payment is done by bank of rs: " + amount);
		}else {
			next.handlePayment(amount);
		}
	}

}
