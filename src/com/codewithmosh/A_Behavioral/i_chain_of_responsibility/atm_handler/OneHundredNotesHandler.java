package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

public class OneHundredNotesHandler extends AtmHandler{

	@Override
	public void doWithdraw(Currency currency) {
		
		if(currency.getAmount()>=100) {
			System.out.println("Withdrawing 100rs notes");
			int num=currency.getAmount()/100;
			int remainder = currency.getAmount()%100;
			System.out.println("Withdrawing "+num+" of 100rs notes");
			if(remainder != 0) {
				this.next.doWithdraw(new Currency(remainder));
			}
		}else {
			this.next.doWithdraw(currency);
		}
	}
}
