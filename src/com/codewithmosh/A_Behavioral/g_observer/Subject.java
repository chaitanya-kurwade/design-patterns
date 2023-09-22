package com.codewithmosh.A_Behavioral.g_observer;

public interface Subject {

	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver(String msg);
}
