package com.codewithmosh.A_Behavioral.b_state.seasons_example;

public class Winter implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		
		System.out.println("Winter season is running...");
		seasonContext.setSeason(new Summer());

	}

}
