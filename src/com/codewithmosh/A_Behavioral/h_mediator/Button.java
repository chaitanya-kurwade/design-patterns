package com.codewithmosh.A_Behavioral.h_mediator;

public class Button extends UIControl{
	
	private boolean isEnabled;

	public Button(DialogBox owner) {
		super(owner);
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		owner.changed(this);
	}
}
