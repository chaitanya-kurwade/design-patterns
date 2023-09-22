package com.codewithmosh.C_Creational.a_prototype.animal;

public class CloneFactory {

	public Animal getClone(Animal animalSample) {
		return animalSample.makeCopy();
	}
}
