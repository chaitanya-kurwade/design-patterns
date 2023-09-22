package com.codewithmosh.A_Behavioral.d_strategy;

public class BlackAndWhiteFilter implements Filter{

	@Override
	public void apply(String fileName) {
		System.out.println("Applying b&w filter on "+fileName);
	}
	
}
