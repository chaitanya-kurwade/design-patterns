package com.codewithmosh.C_Creational.e_builder.example;

public class Main {

	public static void main(String[] args) {
	
		User user = new User.UserBuilder()
				.setEmailId("abc@gmail.com")
				.setUserId("USER123")
				.setUserName("ABC")
				.build();
				
		System.out.println(user);
	}

}
