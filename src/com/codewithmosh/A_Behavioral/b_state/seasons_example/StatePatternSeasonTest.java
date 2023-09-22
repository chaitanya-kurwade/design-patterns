package com.codewithmosh.A_Behavioral.b_state.seasons_example;

public class StatePatternSeasonTest {

	public static void main(String[] args) {
		var seasonContext = new SeasonContext();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
		
		
		System.out.println();
		System.out.println("Setting current season to monsoon...");
		seasonContext.setSeason(new Monsoon());
		seasonContext.nextSeason();
		seasonContext.nextSeason();
	}
	
}
