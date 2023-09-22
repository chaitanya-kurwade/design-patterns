package com.codewithmosh.C_Creational.c_factory_method.electricity_bill_generator;

public class GenerateBillTest {

	public static void main(String[] args) {
		
		PlanFactory factory = new PlanFactory();
		

		
		Plan plan = factory.getPlan("institutional");
		System.out.println("This month's bill is: ");
		plan.getRate();
		plan.genearteBill(123);
					
	}

}
