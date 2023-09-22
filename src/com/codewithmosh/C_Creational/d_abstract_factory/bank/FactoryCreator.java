package com.codewithmosh.C_Creational.d_abstract_factory.bank;

import com.codewithmosh.C_Creational.d_abstract_factory.bank.factories.AbstractFactory;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.factories.BankFactory;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.factories.LoanFactory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("bank")) {
			return new BankFactory();
		}else if(choice.equalsIgnoreCase("loan")) {
			return new LoanFactory();
		}
		return null;
	}
}

