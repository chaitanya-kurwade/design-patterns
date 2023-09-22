package com.codewithmosh.C_Creational.d_abstract_factory.bank.banks;

public class SBI implements Bank{

	private final String bankName;
	
	public SBI(){
		bankName = "SBI BANK";
	}
	
	@Override
	public String getBank() {
		return bankName;
	}
}
