package com.codewithmosh.A_Behavioral.b_state.z_practice;

public class BrushTool implements Tool{

	@Override
	public void mouseUp() {
		System.out.println("Selected brush tool");
	}

	@Override
	public void mouseDown() {
		System.out.println("brushing the element");
	}
	
}
