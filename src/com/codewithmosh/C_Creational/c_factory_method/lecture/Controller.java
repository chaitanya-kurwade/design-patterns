package com.codewithmosh.C_Creational.c_factory_method.lecture;

import java.util.Map;

import com.codewithmosh.C_Creational.c_factory_method.lecture.matcha.MatchaViewEngine;

public class Controller {

	public void render(String viewName, Map<String, Object> context) {
		var engine = createViewEngine();
		var html = engine.render(viewName, context);
		System.out.println(html);
	}
	
	protected ViewEngine createViewEngine(){
		return new MatchaViewEngine();
	}
	
}
