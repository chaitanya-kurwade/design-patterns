package com.codewithmosh.B_Structural.f_bridge.example;

public abstract class Shape {

	protected DrawApi drawApi;
	
	public Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
	public abstract void draw();
	
}
