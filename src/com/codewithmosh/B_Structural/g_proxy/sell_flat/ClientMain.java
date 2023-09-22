package com.codewithmosh.B_Structural.g_proxy.sell_flat;

public class ClientMain {

	public static void main(String[] args) {
		OwnerInterface ownerInterface = new OwnerBrokerProxy();
		ownerInterface.deal("Rakesh");
	}
}
