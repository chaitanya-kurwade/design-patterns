package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.example;

public class CreditCardPaymentHandler extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		if(amount<=1000) {
			System.out.println("Payment is done by credit card of rs: "+amount);
		}else {
			next.handlePayment(amount);
		}
	}
}
