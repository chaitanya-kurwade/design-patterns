package com.codewithmosh.A_Behavioral.b_state.seasons_example;

public class Monsoon implements Season{
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Monsoon season is running...");
		seasonContext.setSeason(new Winter());
	}
}
