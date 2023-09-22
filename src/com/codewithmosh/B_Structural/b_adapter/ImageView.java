package com.codewithmosh.B_Structural.b_adapter;

public class ImageView {

	private Image image;
	
	public ImageView(Image image) {
		this.image = image;
	}
	
	public void apply(Filter filter) {
		filter.apply(image);
	}
	
}
