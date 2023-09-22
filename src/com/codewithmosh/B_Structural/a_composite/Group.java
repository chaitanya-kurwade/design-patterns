package com.codewithmosh.B_Structural.a_composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{

	private List<Component> components = new ArrayList<>();
	
	public void add(Component shape) {
		components.add(shape);
	}
	
	@Override
	public void render() {
		 for(Component component : components) {
			 component.render();
		 }
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		for (Component component : components) {
			component.move();
		}
	}
	
}

