package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class ManagerFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new Manager();
	}

}
