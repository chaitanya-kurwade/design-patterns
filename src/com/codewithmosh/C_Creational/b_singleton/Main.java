package com.codewithmosh.C_Creational.b_singleton;

public class Main {

	public static void main(String[] args) {
		ConfigManager manager = ConfigManager.getInstance();
		manager.set("name", "Chaitanya");
		System.out.println(manager.get("name"));

		ConfigManager manager1 = ConfigManager.getInstance();
		System.out.println(manager1.get("name"));

	}
}
