package com.codewithmosh.C_Creational.d_abstract_factory.lecture.material;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.Button;

public class MaterialButton implements Button {

	@Override
	public void render() {
		System.out.println("Material Button");
	}

}
