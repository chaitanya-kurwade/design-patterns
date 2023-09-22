package com.codewithmosh.A_Behavioral.e_template.practice;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("Initializing football");
	}

	@Override
	void startPlay() {
		System.out.println("playing football");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket football");
	}

}
