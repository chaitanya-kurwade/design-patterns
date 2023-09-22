package com.codewithmosh.C_Creational.c_factory_method.example;

public class Main {

	public static void main(String[] args) {
		ProfessionFactory factory = new ProfessionFactory();
		System.out.println(factory.getProfession("teacher"));

		Profession profession =  
				factory.getProfession("doctor");
		profession.print();
		
	}
}
