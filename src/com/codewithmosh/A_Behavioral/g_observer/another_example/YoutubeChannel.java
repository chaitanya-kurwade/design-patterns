package com.codewithmosh.A_Behavioral.g_observer.another_example;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

	List<Observer> observers = new ArrayList<>();
//	private String name;
//	Observer observer;
//	Observer observer;
	
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void newVideoUploaded(String title) {
		for (Observer observer : observers) {
			observer.update(title);
		}
	}
}
