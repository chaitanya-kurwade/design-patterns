package com.codewithmosh.A_Behavioral.A_essentials;

public class TextBox extends UIControl{

	// there's no enable() method of textbox's it's own method
	// so it will inherit from it's parent class ie UIControl
	
	public void draw(){
		System.out.println("Drawing a textbox");
	}
	
	public static void main(String[] args) {
		// Inheritance example
		TextBox textBox = new TextBox();
		textBox.enable();
	}
	
}
