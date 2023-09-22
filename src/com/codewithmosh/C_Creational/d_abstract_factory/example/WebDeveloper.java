package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 40000;
	}

	@Override
	public String name() {
		System.out.println("I am web developer");
		return "WEB DEVELOPER";
	}

}
