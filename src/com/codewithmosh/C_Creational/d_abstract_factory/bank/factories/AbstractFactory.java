package com.codewithmosh.C_Creational.d_abstract_factory.bank.factories;

import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.Bank;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.Loan;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
	
}
