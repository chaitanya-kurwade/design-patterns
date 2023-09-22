package com.codewithmosh.A_Behavioral.b_state.seasons_example;

public class Summer implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Summer season is running...");
		seasonContext.setSeason(new Monsoon());
	}

}
