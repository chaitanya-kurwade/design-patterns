package com.codewithmosh.C_Creational.d_abstract_factory.lecture.app;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.WidgetFactory;

public class ContactForm {

	public void render(WidgetFactory factory) {
		
		factory.createTextBox().render();
		factory.createButton().render();
	}
}
