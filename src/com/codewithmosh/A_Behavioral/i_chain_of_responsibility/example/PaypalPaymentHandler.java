package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.example;

public class PaypalPaymentHandler extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		if(amount<=1500) {
			System.out.println("Payment is done by paypal of rs: "+amount);
		}else {
			next.handlePayment(amount);
		}
	}
}
