package com.codewithmosh.A_Behavioral.A_essentials;


public class MainPoly {

	public static void main(String[] args) {
		TaxCalculator calculator = getCalculator();
		calculator.calculateTax();

		// Polymorphism example
		drawUIControl(new TextBox());
		drawUIControl(new CheckBox());				
	}
	
	public static void drawUIControl(UIControl uiControl) {
		uiControl.draw();
	}
	
	public static TaxCalculator getCalculator() {
		return new TaxCalculator2019();
	}
		 
}
