package com.codewithmosh.A_Behavioral.b_state.water_example;

public class Water implements Liquid {

	@Override
	public void nextState(LiquidContext liquidContext) {
		
		System.out.println("liquid is in water state");
		liquidContext.setLiquid(new Vapour());
		
		
	}

}
