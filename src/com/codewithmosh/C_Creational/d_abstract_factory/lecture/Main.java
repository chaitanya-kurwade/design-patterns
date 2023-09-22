package com.codewithmosh.C_Creational.d_abstract_factory.lecture;

import com.codewithmosh.C_Creational.d_abstract_factory.lecture.ant.AntWidgetFactory;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.app.ContactForm;
import com.codewithmosh.C_Creational.d_abstract_factory.lecture.material.MaterialWidgetFactory;

public class Main {

	public static void main(String[] args) {
		new ContactForm().render(new MaterialWidgetFactory());
		new ContactForm().render(new AntWidgetFactory());
	}
}

