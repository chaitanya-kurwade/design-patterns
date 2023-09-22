package com.codewithmosh.C_Creational.d_abstract_factory.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.codewithmosh.C_Creational.d_abstract_factory.bank.banks.Bank;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.factories.AbstractFactory;
import com.codewithmosh.C_Creational.d_abstract_factory.bank.loans.Loan;

public class Test {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = br.readLine();

		System.out.print("\n");
		System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

		String loanName = br.readLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBank() + ": ");

		double rate = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		double years = Integer.parseInt(br.readLine());

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBank());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}
}
