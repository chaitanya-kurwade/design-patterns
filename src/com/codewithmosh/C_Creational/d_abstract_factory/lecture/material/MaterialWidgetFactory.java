package com.codewithmosh.C_Creational.d_abstract_factory.lecture.material;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.Button;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.TextBox;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MaterialButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new MaterialTextBox();
	}

}
