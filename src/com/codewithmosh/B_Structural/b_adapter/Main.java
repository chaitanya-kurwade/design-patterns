package com.codewithmosh.B_Structural.b_adapter;

import com.codewithmosh.B_Structural.b_adapter.avaFilters.Caramel;

public class Main {

	public static void main(String[] args) {
		var imageView = new ImageView(new Image());
		imageView.apply(new CaramelFilter(new Caramel()));
	}
	
}
