package com.codewithmosh.A_Behavioral.c_iterator;

public class IteratorMain {

	public static void main(String[] args) {
		var history = new BrowseHistory();
		
		history.push("google.com");
		history.push("facebook.com");
		history.push("twitter.com");
		history.push("javatpoint.com");
		
		history.push("google.com");
		history.push("facebook.com");
		history.push("twitter.com");
		history.push("javatpoint.com");
		
		history.push("google.com");
		history.push("facebook.com");
		history.push("twitter.com");
		history.push("javatpoint.com");
		
		
		Iterator iterator = history.createIterator();
		while (iterator.hasNext()) {
			var url = iterator.current();
			System.out.println(url);
			iterator.next();
		}
	}
}
