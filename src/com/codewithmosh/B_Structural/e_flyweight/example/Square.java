package com.codewithmosh.B_Structural.e_flyweight.example;

public class Square implements Shape{

	private String color;
	private int x;
	private int y;
	private int length;
	
	public Square(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing "+color+" square of "+length+" length at "+x+" & "+y+" coordinates");
	}
}
