package com.codewithmosh.C_Creational.d_abstract_factory.lecture.material;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.TextBox;

public class MaterialTextBox implements TextBox{

	@Override
	public void render() {
		System.out.println("Material TextBox");
	}

}
