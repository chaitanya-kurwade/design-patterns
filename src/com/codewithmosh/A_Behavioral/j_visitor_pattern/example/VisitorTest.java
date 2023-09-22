package com.codewithmosh.A_Behavioral.j_visitor_pattern.example;

public class VisitorTest {

	public static void main(String[] args) {
		TaxVisitor taxVisitor = new TaxVisitor();
		TaxHolidayVisitor holidayVisitor = new TaxHolidayVisitor();
		
		
		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(20.32);
		
		System.out.println(milk.accept(taxVisitor)+"\n");
		System.out.println(vodka.accept(taxVisitor)+"\n");
		System.out.println(cigars.accept(taxVisitor)+"\n");
		
		System.out.println("TAX HOLIDAY PRICES\n");
		
		System.out.println(milk.accept(holidayVisitor)+"\n");
		System.out.println(vodka.accept(holidayVisitor)+"\n");
		System.out.println(cigars.accept(holidayVisitor)+"\n");
	}
}
