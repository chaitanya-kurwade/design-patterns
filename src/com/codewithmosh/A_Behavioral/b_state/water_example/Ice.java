package com.codewithmosh.A_Behavioral.b_state.water_example;

public class Ice implements Liquid{

	@Override
	public void nextState(LiquidContext liquidContext) {
		System.out.println("liquid is in ice state");
		liquidContext.setLiquid(new Water());
		
	}

}
