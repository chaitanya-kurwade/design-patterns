package com.codewithmosh.B_Structural.f_bridge.example;

public class Circle extends Shape{

	private int radius, x, y;
	
	public Circle(DrawApi drawApi, int radius, int x, int y) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
