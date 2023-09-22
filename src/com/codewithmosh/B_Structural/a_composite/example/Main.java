package com.codewithmosh.B_Structural.a_composite.example;

public class Main {
	public static void main(String[] args) {
		var box = new CompositeBox(new VideoGame("contra", 50));
		var box2 = new CompositeBox(new Book("5 am club", 100));
		var box3 = new CompositeBox(new Mobile("Samsung", 15000));
		System.out.println(box.calculatePrice());
		System.out.println(box2.calculatePrice());
		System.out.println(box3.calculatePrice());
	}
}
