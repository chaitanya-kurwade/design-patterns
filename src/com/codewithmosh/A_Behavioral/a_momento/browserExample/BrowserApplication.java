package com.codewithmosh.A_Behavioral.a_momento.browserExample;

public class BrowserApplication {

	public static void main(String[] args) {
		
		var browser = new Browser();
		var history = new BrowserHistory();
		
		browser.setAddress("google.com");
		
		history.push(browser.createContent());
		browser.setAddress("twitter.com");
		
		history.push(browser.createContent());
		browser.setAddress("facebook.com");

		
//		browser.restoreContent(history.pop());//pressing back to traverse at twitter page
//		browser.restoreContent(history.pop());//pressing back to traverse at google page
		
		System.out.println(browser.getAddress());
		
	}
}
