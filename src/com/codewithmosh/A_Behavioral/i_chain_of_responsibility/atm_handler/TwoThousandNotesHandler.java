package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

public class TwoThousandNotesHandler extends AtmHandler{

	

	@Override
	public void doWithdraw(Currency currency) {
		
		
		if(currency.getAmount()>=2000) {
			System.out.println("Withdrawing 2000rs notes");
			int num=currency.getAmount()/2000;
			int remainder = currency.getAmount()%2000;
			System.out.println("Withdrawing "+num+" of 2000rs notes");
			if(remainder != 0) {
				this.next.doWithdraw(new Currency(remainder));
			}
		}else {
			this.next.doWithdraw(currency);
		}
	}

}