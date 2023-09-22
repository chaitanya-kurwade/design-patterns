package com.codewithmosh.A_Behavioral.b_state.mobile_alerts_example;

public class Vibrate implements Mobile {

	@Override
	public void alert(MobileContext mobileContext) {
		// TODO Auto-generated method stub
		System.out.println("Mobile is on vibrate mode");
		mobileContext.setAlert(new Ringing());
	}

}
