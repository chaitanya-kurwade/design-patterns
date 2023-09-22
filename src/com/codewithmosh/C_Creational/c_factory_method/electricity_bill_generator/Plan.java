package com.codewithmosh.C_Creational.c_factory_method.electricity_bill_generator;

public abstract class Plan {

	protected double rate;
	
	public abstract void getRate();
	
	public void genearteBill(int units) {
		System.out.println(rate*units);
	}
}
