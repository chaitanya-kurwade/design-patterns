package com.codewithmosh.B_Structural.e_flyweight.lecture;

public class Point {

	private int x;
	private int y;
	private PointIcon icon;
	
	public Point(int x, int y, PointIcon icon) {
		super();
		this.x = x;
		this.y = y;
		this.icon = icon;
	}
	
	public void draw() {
		System.out.printf("%s is located at (%d , %d)", icon.getPointType(), x, y);
	}
	
}
