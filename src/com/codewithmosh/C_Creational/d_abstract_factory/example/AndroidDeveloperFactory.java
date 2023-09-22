package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
