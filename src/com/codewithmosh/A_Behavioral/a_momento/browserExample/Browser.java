package com.codewithmosh.A_Behavioral.a_momento.browserExample;

//originator
public class Browser {

	private String webAddress;
	
	public BrowserState createContent() {
		return new BrowserState(webAddress);
	}
	
	public void restoreContent(BrowserState state ) {
		webAddress = state.getContent();
	}
	
	public void setAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
	public String getAddress() {
		return webAddress;
	}
	
}
