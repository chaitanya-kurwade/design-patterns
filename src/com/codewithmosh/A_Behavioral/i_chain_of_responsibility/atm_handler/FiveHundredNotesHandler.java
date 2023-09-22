package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

public class FiveHundredNotesHandler extends AtmHandler{

	@Override
	public void doWithdraw(Currency currency) {
		
		
		if(currency.getAmount()>=500) {
			System.out.println("Withdrawing 500rs notes");
			int num=currency.getAmount()/500;
			int remainder = currency.getAmount()%500;
			
			System.out.println("Withdrawing "+num+" of 500rs notes");
			if(remainder != 0) {
				this.next.doWithdraw(new Currency(remainder));
			}
		}else {
			this.next.doWithdraw(currency);
		}
	}
}
