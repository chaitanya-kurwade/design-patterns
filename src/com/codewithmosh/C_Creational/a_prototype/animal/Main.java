package com.codewithmosh.C_Creational.a_prototype.animal;

public class Main {

	public static void main(String[] args) {
		CloneFactory cloneFactory = new CloneFactory();
		
		Sheep sheep = new Sheep();
		Sheep sheep2 = (Sheep)cloneFactory.getClone(sheep);
		
		System.out.println(sheep+"'s Hashcode "+System.identityHashCode(System.identityHashCode(sheep)));
		System.out.println(sheep2+"'s Cloned Hashcode "+System.identityHashCode(System.identityHashCode(sheep2)));
	}
}
