package com.codewithmosh.A_Behavioral.c_iterator.another_example;

public class AnimalArray {

	private String[] animals = new String[5];
	private int count;
	
	public void push(String animal) {
		animals[count++]=animal;
	}
	
	public String pop() {
		return animals[--count];
	}
	
	
	public FlowerAnimalIterator createAnimalIterator() {
		return new AnimalIterator(this);
	}
	
	
	
	private class AnimalIterator implements FlowerAnimalIterator {
		private AnimalArray animalArray;
		private int index;
		
		public AnimalIterator(AnimalArray animalArray) {
			this.animalArray=animalArray;
		}

		public boolean hasNext() {
			return (index < animalArray.count);
		}
		
		public String current() {
			return animalArray.animals[index];
		}
		
		public Object next() {
			return index++;
		}
	}
}
