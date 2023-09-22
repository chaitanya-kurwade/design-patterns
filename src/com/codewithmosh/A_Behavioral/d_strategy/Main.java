package com.codewithmosh.A_Behavioral.d_strategy;

public class Main {

	public static void main(String[] args) {
		ImageStorage imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
		imageStorage.store("Animal_image");
		System.out.println();
		ImageStorage imageStorage1 = new ImageStorage(new PngCompressor(), new GreyscaleFilter());
		imageStorage1.store("Animal_image");
	}
}
