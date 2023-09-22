package com.codewithmosh.A_Behavioral.c_iterator.another_example;

public class Test {

	public static void main(String[] args) {
		
		FlowerList list = new FlowerList();
		
		list.push("lily");
		list.push("jasmine");
		list.push("lotus");
		list.push("sunflower");
		list.push("lily");
		
		FlowerAnimalIterator flowerIterator = list.createFlowerIterator();
		while(flowerIterator.hasNext()) {
			System.out.println(flowerIterator.current());
			flowerIterator.next();
		}
		System.out.println();

		AnimalArray array = new AnimalArray();
		
		array.push("dog");
		array.push("elephant");
		array.push("monkey");
		array.push("lion");
		array.push("tiger");
		
		FlowerAnimalIterator animalIterator = array.createAnimalIterator();
		while(animalIterator.hasNext()) {
			System.out.println(animalIterator.current());
			animalIterator.next();
		}
	}
}
