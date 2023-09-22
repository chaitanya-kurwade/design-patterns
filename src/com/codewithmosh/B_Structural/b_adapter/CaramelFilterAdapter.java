package com.codewithmosh.B_Structural.b_adapter;

import com.codewithmosh.B_Structural.b_adapter.avaFilters.Caramel;
								
								//used inheritance to implement adapter pattern
public class CaramelFilterAdapter extends Caramel implements Filter{
	//but this approach is not good because java don't allow multiple inheritance
	@Override
	public void apply(Image image) {
		init();
		render(image);
	}
}
