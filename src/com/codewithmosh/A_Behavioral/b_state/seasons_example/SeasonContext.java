package com.codewithmosh.A_Behavioral.b_state.seasons_example;

public class SeasonContext {

	private Season season;
	
	public SeasonContext() {
		this.season= new Summer();
	}
	
	public void setSeason(Season season) {
		this.season = season;
	}
	
	public void nextSeason() {
		this.season.nextSeason(this);
	}
}
