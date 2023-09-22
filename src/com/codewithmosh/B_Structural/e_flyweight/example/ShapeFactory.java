package com.codewithmosh.B_Structural.e_flyweight.example;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap circleMap = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle)circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		
		return circle;
	}
	
	
	private static final HashMap squareMap = new HashMap<>();
	
	public static Shape getSquare(String color) {
		Square square = (Square)squareMap.get(color);
		if(square == null) {
			square = new Square(color);
			squareMap.put(color, square);
		}
		return square;
	}
	
}
