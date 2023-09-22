package com.codewithmosh.A_Behavioral.g_observer.another_example;

public interface Subject {

	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void newVideoUploaded(String title);
}
