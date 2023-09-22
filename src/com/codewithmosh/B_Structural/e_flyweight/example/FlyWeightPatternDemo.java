package com.codewithmosh.B_Structural.e_flyweight.example;

public class FlyWeightPatternDemo {

	private static final String colors[] = {"Red","Yellow","Green","Black","Purple"};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
System.out.println();		
		for (int i = 0; i < 20; i++) {
						
			Square square = (Square)ShapeFactory.getSquare(getRandomColor());
			square.setLength(100);
			square.setX(getRandomX());
			square.setY(getRandomY());
			square.draw();
		}
	}
	
	private static int getRandomY() {
		int y = (int)(Math.random()*100);
		return y;
	}

	private static int getRandomX() {
		int x = (int)(Math.random()*100);
		return x;
	}

	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];		
	}
}
