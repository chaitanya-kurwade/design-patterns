package com.codewithmosh.C_Creational.d_abstract_factory.bank.factories;

import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.Bank;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.EducationalLoan;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.HomeLoan;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.Loan;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.PersonalLoan;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {

		if (loan == null) {
			return null;
		}

		if (loan.equalsIgnoreCase("education")) {
			return new EducationalLoan();
		} else if (loan.equalsIgnoreCase("personal")) {
			return new PersonalLoan();
		} else if (loan.equalsIgnoreCase("home")) {
			return new HomeLoan();
		}

		return null;
	}

}
