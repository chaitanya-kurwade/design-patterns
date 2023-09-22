package com.codewithmosh.A_Behavioral.b_state.z_practice;

public class SelectionTool implements Tool{

	@Override
	public void mouseUp() {
		System.out.println("Selecting icon");		
	}

	@Override
	public void mouseDown() {
		System.out.println("Drawing rectanlge");
	}

}
