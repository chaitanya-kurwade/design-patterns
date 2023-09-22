package com.codewithmosh.B_Structural.g_proxy.sell_flat;

public class OwnerBrokerProxy implements OwnerInterface{

	private OwnerClass ownerClass;
	
	public OwnerBrokerProxy() {
		ownerClass = new OwnerClass("Rahul");
	}
	
	@Override
	public void deal(String client) {
		if (client.equals("Rakesh")) {
			System.out.println("Deal done");
			return;
		} else {
			System.out.println("Deal cancel");
		}
	}

}
