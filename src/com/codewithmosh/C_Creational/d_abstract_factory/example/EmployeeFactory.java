package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory abstractFactory) {
		return abstractFactory.createEmployee();
	}
}
