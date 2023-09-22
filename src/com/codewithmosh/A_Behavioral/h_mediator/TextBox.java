package com.codewithmosh.A_Behavioral.h_mediator;

public class TextBox extends UIControl{

	private String content;
	
	public TextBox(DialogBox owner) {
		super(owner);
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		owner.changed(this);
	}
}
