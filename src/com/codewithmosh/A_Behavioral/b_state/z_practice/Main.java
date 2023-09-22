package com.codewithmosh.A_Behavioral.b_state.z_practice;

public class Main {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		BrushTool brushTool = new BrushTool();
		SelectionTool selectionTool = new SelectionTool();
		EraserTool eraserTool = new EraserTool();
		
		canvas.setTool(selectionTool);
		selectionTool.mouseUp();
		selectionTool.mouseDown();
		
		System.out.println();
		canvas.setTool(brushTool);
		brushTool.mouseUp();
		brushTool.mouseDown();
		
		System.out.println();
		canvas.setTool(eraserTool);
		eraserTool.mouseUp();
		eraserTool.mouseDown();
	}
}
