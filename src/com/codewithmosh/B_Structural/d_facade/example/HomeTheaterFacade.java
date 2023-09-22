package com.codewithmosh.B_Structural.d_facade.example;

public class HomeTheaterFacade {

	private Television television;
	private Speaker speaker;
	private Lights lights;
	
	public HomeTheaterFacade(Television television, Speaker speaker,Lights lights) {
		this.lights = lights;
		this.speaker = speaker;
		this.television = television;
	}
	
	public void watchTv() {
		speaker.switchOnSpeaker();
		television.switchOnTv();
		lights.switchOffLights();
	}
	
	public void turnOffTv() {
		speaker.switchOffSpeaker();
		television.switchOffTv();
		lights.switchOnLights();
	}
	
}
