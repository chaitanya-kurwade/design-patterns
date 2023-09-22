package com.codewithmosh.C_Creational.c_factory_method.lecture.matcha;

import java.util.Map;

import com.codewithmosh.C_Creational.c_factory_method.lecture.ViewEngine;

public class MatchaViewEngine implements ViewEngine {

	public String render(String viewName, Map<String, Object> context) {
		return "View rendered by Matcha framework";
	}
	
}
