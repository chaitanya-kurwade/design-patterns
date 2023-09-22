package com.codewithmosh.C_Creational.c_factory_method.lecture.sharp;

import java.util.Map;

import com.codewithmosh.C_Creational.c_factory_method.lecture.ViewEngine;

public class SharpViewEngine implements ViewEngine{

	@Override
	public String render(String viewName, Map<String, Object> context) {
		// TODO Auto-generated method stub
		return "Sharp view engine rendered";
	}

}
