package com.codewithmosh.B_Structural.d_facade.example;

public class MainTv {
	public static void main(String[] args) {
		HomeTheaterFacade theaterFacade = new HomeTheaterFacade(new Television(), new Speaker(), new Lights());
		
		theaterFacade.watchTv();
		System.out.println();
		theaterFacade.turnOffTv();
	}
}
