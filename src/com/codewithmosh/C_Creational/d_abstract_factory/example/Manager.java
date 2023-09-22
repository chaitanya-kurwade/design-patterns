package com.codewithmosh.C_Creational.d_abstract_factory.example;

public class Manager implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String name() {
		System.out.println("I am a manager");
		return "MANAGER";
	}

}
