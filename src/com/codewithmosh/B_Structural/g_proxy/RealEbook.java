package com.codewithmosh.B_Structural.g_proxy;

public class RealEbook implements Ebook{
	private String fileName;
	
	public RealEbook(String fileName) {
		this.fileName = fileName;
		load();
	}
	
	private void load() {
		System.out.println("Loading file: "+fileName);
	}
	
	public void show() {
		System.out.println("Showing file: "+fileName);
	}
	
	public String getFileName(){
		return this.fileName;
	}
}
