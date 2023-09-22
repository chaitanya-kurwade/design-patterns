package com.codewithmosh.C_Creational.d_abstract_factory.bank.loans;

public class HomeLoan extends Loan{

	
	@Override
	public void getInterestRate(double rate) {
		       this.rate=rate;  
	}
}
