package com.codewithmosh.C_Creational.d_abstract_factory.lecture.ant;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.TextBox;

public class AntTextBox implements TextBox{

	@Override
	public void render() {
		System.out.println("Ant TextBox");
	}

}
