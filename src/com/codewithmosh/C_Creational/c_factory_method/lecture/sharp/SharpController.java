package com.codewithmosh.C_Creational.c_factory_method.lecture.sharp;

import com.codewithmosh.C_Creational.c_factory_method.lecture.Controller;
import com.codewithmosh.C_Creational.c_factory_method.lecture.ViewEngine;

public class SharpController extends Controller{

	@Override
	protected ViewEngine createViewEngine() {
		// TODO Auto-generated method stub
		return new SharpViewEngine();
	}
}
