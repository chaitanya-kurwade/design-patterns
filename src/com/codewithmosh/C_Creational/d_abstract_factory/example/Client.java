package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class Client {

	public static void main(String[] args) {
		
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		e1.name();
		
		Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		e2.name();
		
		Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		e3.name();
		
	}

}
