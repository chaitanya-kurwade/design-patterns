package com.codewithmosh.A_Behavioral.b_state.mobile_alerts_example;

public class Ringing implements Mobile {

	@Override
	public void alert(MobileContext mobileContext) {
		
		System.out.println("Mobile is on ringing mode");
		mobileContext.setAlert(new Silent());
		
	}

}
