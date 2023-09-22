package com.codewithmosh.B_Structural.f_bridge.example;

public class Main {

	public static void main(String[] args) {
		var shape1 = new Circle(new RedCircle(), 100, 50, 50);
		shape1.draw();
		
		var shape2 = new Circle(new GreenCircle(), 100, 50, 50);
		shape2.draw();
	}

}
