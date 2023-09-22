package com.codewithmosh.C_Creational.d_abstract_factory.lecture.ant;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.Button;

public class AntButton implements Button{

	@Override
	public void render() {
		System.out.println("Ant Button");
	}

}
