package com.codewithmosh.B_Structural.a_composite;

public class Main {
	public static void main(String[] args) {
		
		Group group = new Group();
		group.add(new Shape());
		group.add(new Shape());
		group.render();
		group.move();
		
		Group group2 = new Group();
		group2.add(new Shape());
		group2.add(new Shape());
		group2.render();
		group2.move();
	}
}
