package com.codewithmosh.A_Behavioral.g_observer.another_example;

public interface Observer {
	
	void update(String title);
	Observer updateByName(String title);
}
