package com.codewithmosh.B_Structural.g_proxy;

public class Main {

	public static void main(String[] args) {
		var library = new Library();
		String[] ebooks = {"a","b","c","d","e"};
		
		for(var ebook : ebooks) {
			library.add(new LoggingEbookProxy(ebook));
			library.add(new EbookProxy(ebook));
		}
		
		library.openEbook("a");
		library.openEbook("b");
	}
}
