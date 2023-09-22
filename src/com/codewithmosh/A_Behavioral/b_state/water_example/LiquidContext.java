package com.codewithmosh.A_Behavioral.b_state.water_example;

public class LiquidContext {

	private Liquid liquid;
	
	public LiquidContext() {
		this.liquid = new Water();
	}

	public void setLiquid(Liquid liquid) {
		this.liquid = liquid;		
	}

	public void nextState() {
		this.liquid.nextState(this);
	}
}
