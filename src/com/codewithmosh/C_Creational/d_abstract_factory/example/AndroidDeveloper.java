package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("I am android developer");
		return "ANDROID DEVELOPER";
	}

}
