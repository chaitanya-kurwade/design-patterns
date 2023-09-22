package com.codewithmosh.A_Behavioral.b_state.water_example;

public class Vapour implements Liquid{

	@Override
	public void nextState(LiquidContext liquidContext) {
		// TODO Auto-generated method stub
		System.out.println("liquid is in vapour state");
		liquidContext.setLiquid(new Ice());
	}

}
