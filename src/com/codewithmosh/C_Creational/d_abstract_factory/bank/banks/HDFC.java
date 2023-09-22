package com.codewithmosh.C_Creational.d_abstract_factory.bank.banks;

public class HDFC implements Bank{

	private final String bankName;

	public HDFC(){
		this.bankName = "HDFC BANK";
	}
	
	@Override
	public String getBank() {
		return bankName;
	}

}
