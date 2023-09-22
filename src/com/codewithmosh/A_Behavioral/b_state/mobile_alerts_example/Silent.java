package com.codewithmosh.A_Behavioral.b_state.mobile_alerts_example;

public class Silent implements Mobile {

	@Override
	public void alert(MobileContext mobileContext) {
		// TODO Auto-generated method stub
		System.out.println("Mobile is on silent mode");
		mobileContext.setAlert(new Vibrate());
	}

}
