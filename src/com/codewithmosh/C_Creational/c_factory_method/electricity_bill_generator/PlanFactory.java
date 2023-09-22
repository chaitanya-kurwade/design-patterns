package com.codewithmosh.C_Creational.c_factory_method.electricity_bill_generator;

public class PlanFactory {

	public Plan getPlan(String plan) {
		
		if(plan.equalsIgnoreCase("commercial")) {
			return new CommercialPlan();
		}else if(plan.equalsIgnoreCase("domestic")) {
			return new DomesticPlan();
		}else if(plan.equalsIgnoreCase("institutional")) {
			return new InstitutionalPlan();
		}else{
			System.out.println("Put correct plan name");
		}
		return null;
	}
	
}
