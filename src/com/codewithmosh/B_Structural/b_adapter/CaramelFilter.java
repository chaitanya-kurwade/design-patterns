package com.codewithmosh.B_Structural.b_adapter;

import com.codewithmosh.B_Structural.b_adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter{

	//composition is used to implement adapter pattern
	private Caramel caramel;
	
	public CaramelFilter(Caramel caramel) {
		this.caramel = caramel;
	}
	
	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);
	}

}
 