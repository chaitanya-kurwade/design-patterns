package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class WebDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper() ;
	}

}
