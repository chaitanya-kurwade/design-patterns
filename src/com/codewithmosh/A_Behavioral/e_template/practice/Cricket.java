package com.codewithmosh.A_Behavioral.e_template.practice;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Initializing cricket");
	}

	@Override
	void startPlay() {
		System.out.println("playing cricket");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket stopped");
	}

}
