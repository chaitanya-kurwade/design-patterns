package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

public abstract class AtmHandler {
	
	protected AtmHandler next;
	
	public void setNext(AtmHandler next) {
		this.next = next;
	}
	
	public abstract void doWithdraw(Currency currency);
	
}
