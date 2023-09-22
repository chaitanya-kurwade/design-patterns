package com.codewithmosh.B_Structural.c_decorator.lecture;

public class CloudStream implements Stream{

	@Override
	public void write(String data) {
		System.out.println("This is data "+data);
	}
}
