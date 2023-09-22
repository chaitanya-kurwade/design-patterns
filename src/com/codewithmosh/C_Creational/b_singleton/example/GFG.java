package com.codewithmosh.C_Creational.b_singleton.example;

//Java code to create singleton class by
//Eager Initialization
public class GFG
{
//public instance initialized when loading the class
private static final GFG instance = new GFG();

private GFG()
{
	// private constructor
}
public static GFG getInstance(){
		return instance;
	}


	public static void main(String[] args) {
		GFG gfg = GFG.getInstance();
		System.out.println(gfg);
	}
}

