package com.codewithmosh.C_Creational.d_abstract_factory.bank.banks;

public class ICICI implements Bank{

	private final String bankName;
	
	public ICICI(){
		bankName = "ICICI BANK";
	}
	
	@Override
	public String getBank() {
		return bankName;
	}
}
