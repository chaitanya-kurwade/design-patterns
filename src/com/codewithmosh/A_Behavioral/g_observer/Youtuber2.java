package com.codewithmosh.A_Behavioral.g_observer;

import java.util.ArrayList;
import java.util.List;

public class Youtuber2 implements Subject{

	List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
		System.out.println("Observer added in yt 2");
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		System.out.println("Observer removed from yt 2");
	}
	
	public void notifyObserver(String msg) {
		for(Observer observer : observers) {
			observer.update(msg);
		}
	}
}
