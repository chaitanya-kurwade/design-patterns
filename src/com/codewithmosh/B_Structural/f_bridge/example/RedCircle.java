package com.codewithmosh.B_Structural.f_bridge.example;

public class RedCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
