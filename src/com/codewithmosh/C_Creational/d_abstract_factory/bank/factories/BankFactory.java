package com.codewithmosh.C_Creational.d_abstract_factory.bank.factories;

import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.Bank;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.HDFC;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.ICICI;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.SBI;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.Loan;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		
		if(bank.equals(null)) {
			return null;
		}
		
		if(bank.equalsIgnoreCase("hdfc")) {
			return new HDFC();
		}else if(bank.equalsIgnoreCase("icici")){
			return new ICICI();
		}else if(bank.equalsIgnoreCase("sbi")){
			 return new SBI();
		}
		
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}
