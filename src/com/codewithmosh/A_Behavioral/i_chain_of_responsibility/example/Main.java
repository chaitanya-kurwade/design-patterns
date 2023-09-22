package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.example;

public class Main {

	public static void main(String[] args) {
		var bank = new BankPaymentHandler();
		var creditCard = new CreditCardPaymentHandler();
		var paypal = new PaypalPaymentHandler();
		bank.setNext(creditCard);
		creditCard.setNext(paypal);
		
		bank.handlePayment(600);
		bank.handlePayment(300);
		bank.handlePayment(1300);
		bank.handlePayment(700);
		bank.handlePayment(1500);
	}
	
}
