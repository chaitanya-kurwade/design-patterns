package com.codewithmosh.A_Behavioral.c_iterator.another_example1;

public class Test {
	public static void main(String[] args) {
		ListFlower flower = new ListFlower();
		flower.push("a");
		flower.push("a");
		flower.push("a");
		flower.push("a");
		
		AnimalFlowerIterator iterator = flower.createFlowerIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.current());
			iterator.next();
		}
	}
}
