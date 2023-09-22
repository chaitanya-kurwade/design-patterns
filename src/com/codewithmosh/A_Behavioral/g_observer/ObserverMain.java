package com.codewithmosh.A_Behavioral.g_observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		Youtuber1 youtuber1 = new Youtuber1();
		Youtuber2 youtuber2 = new Youtuber2();
		
		Subscriber1 subscriber1 = new Subscriber1();
		Subscriber2 subscriber2 =  new Subscriber2();
		
		youtuber1.addObserver(subscriber1);
		youtuber1.addObserver(subscriber2);
		
		youtuber2.addObserver(subscriber2);
		
		youtuber1.removeObserver(subscriber2);
		
		
	}
	
}
