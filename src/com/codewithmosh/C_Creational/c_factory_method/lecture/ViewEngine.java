package com.codewithmosh.C_Creational.c_factory_method.lecture;
import java.util.Map;

public interface ViewEngine {
	String render(String viewName, Map<String, Object> context);
}

