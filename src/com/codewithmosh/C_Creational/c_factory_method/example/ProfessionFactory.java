package com.codewithmosh.C_Creational.c_factory_method.example;

public class ProfessionFactory {
		
	public Profession getProfession(String profession) {
		
		if (profession.equalsIgnoreCase("doctor")) {
			return new Doctor();
		}else if (profession.equalsIgnoreCase("engineer")) {
			return new Engineer();
		}else if (profession.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}else {
			return new NotListed();
		}
	}
	
}
