package com.codewithmosh.A_Behavioral.A_essentials;

public class User {

	public String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hi, my name is "+this.name);
	}
	
	public static void main(String[] args) {
		User user = new User("Mosh");
//	System.out.println(user.name);
	user.sayHello();
	}
}
