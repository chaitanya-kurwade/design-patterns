package com.codewithmosh.C_Creational.a_prototype;

public class ContextMenu {

	
	public void duplicate(Component component) {
		Component newComponent = component.cloneOrCopy();
		System.out.println(newComponent.cloneOrCopy());
//		newComponent.render();
	}
	
}
