package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

public class TwoHundredNotesHandler extends AtmHandler{

	@Override
	public void doWithdraw(Currency currency) {
		
		
		if(currency.getAmount()>=200) {
			System.out.println("Withdrawing 200rs notes");
			int num=currency.getAmount()/200;
			int remainder = currency.getAmount()%200;
			System.out.println("Withdrawing "+num+" of 200rs notes");
			if(remainder != 0) {
				this.next.doWithdraw(new Currency(remainder));
			}
		}else {
			this.next.doWithdraw(currency);
		}
	}
}
