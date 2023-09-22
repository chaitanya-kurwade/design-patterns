package com.codewithmosh.C_Creational.d_abstract_factory.lecture.ant;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.Button;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.TextBox;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AntButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new AntTextBox();
	}

}
