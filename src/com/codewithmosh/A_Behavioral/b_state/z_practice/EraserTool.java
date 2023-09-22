package com.codewithmosh.A_Behavioral.b_state.z_practice;

public class EraserTool implements Tool{

	@Override
	public void mouseUp() {
		System.out.println("Eraser selected");		
	}

	@Override
	public void mouseDown() {
		System.out.println("Erasing canvas");		
	}

}
