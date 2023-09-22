package com.codewithmosh.A_Behavioral.b_state.water_example;

public class LiquidMain {

	public static void main(String[] args) {
	
		LiquidContext context = new LiquidContext();
		
		context.nextState();
		context.nextState();
		context.nextState();
		context.nextState();
		
		System.out.println();
		System.out.println("explicitely changing the liquid state");
		context.setLiquid(new Ice());
		context.nextState();
		
	}
}
