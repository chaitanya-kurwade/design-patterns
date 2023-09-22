package com.codewithmosh.A_Behavioral.b_state.mobile_alerts_example;

public class MobileContext {

	private Mobile mobile;
	
	public MobileContext() {
		this.mobile = new Ringing();
	}
	
	public void setAlert(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void nextAlert() {
		this.mobile.alert(this);
	}
	
}
