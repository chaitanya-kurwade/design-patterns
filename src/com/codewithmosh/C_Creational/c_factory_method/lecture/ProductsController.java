package com.codewithmosh.C_Creational.c_factory_method.lecture;

import java.util.HashMap;
import java.util.Map;
import com.codewithmosh.C_Creational.c_factory_method.lecture.sharp.SharpController;

public class ProductsController extends Controller{

	public void listProducts() {
		//get products from database
		Map<String, Object> context = new HashMap<>();
		//context.put(products); //the implementation not provided
		render("products.html", context);
	}
	
}
