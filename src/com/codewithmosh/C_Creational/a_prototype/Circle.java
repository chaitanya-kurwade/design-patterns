package com.codewithmosh.C_Creational.a_prototype;

public class Circle implements Component{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void render() {
		System.out.println("Rendering circle: "+radius);
	}

	@Override
	public Component cloneOrCopy() {

		Circle newCircle = new Circle(radius);
		newCircle.setRadius(radius);
		return newCircle;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

}
