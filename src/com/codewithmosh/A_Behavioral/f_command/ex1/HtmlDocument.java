package com.codewithmosh.A_Behavioral.f_command.ex1;

public class HtmlDocument {

	private String content;
	
	public void makeBold() {
		content = "<b>"+content+"</b>";
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
