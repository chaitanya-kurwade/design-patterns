package com.codewithmosh.B_Structural.g_proxy.sell_flat;

public class OwnerClass implements OwnerInterface{

	private String ownerName;
	
	public OwnerClass(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public void deal(String client) {
		System.out.println("Deal done");
	}
}
