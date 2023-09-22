package com.codewithmosh.C_Creational.d_abstract_factory.bank.loans;

public abstract class Loan {
	
	protected double rate;
	
	public abstract void getInterestRate(double rate);
	
	public void calculateLoanPayment(double loanAmount, double years) {
		
        /* 
		to calculate monthly loan payment i.e. EMI   
		rate=annual interest rate/12*100; 
		n=number of monthly installments;            
		1year=12 months. 
		so, n=years*12;
        */
		
		double EMI;  
	    double months;
	    months=years*12;  
	    rate=rate/1200;
	    
	    EMI=((rate*Math.pow((1+rate),months))/((Math.pow((1+rate),months))-1)) * loanAmount;
	    
	    System.out.println("Your monthly EMI is "+ EMI 
	    		+" for the amount "+loanAmount+" you have borrowed.");     

	}
	
}
