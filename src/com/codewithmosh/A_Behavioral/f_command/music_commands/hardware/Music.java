package com.codewithmosh.A_Behavioral.f_command.music_commands.hardware;

public class Music {

	private int volume;
	private float radioStation;

	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		System.out.println("Setting volume to: "+volume);
		this.volume = volume;
	}

	public float getRadioStation() {
		return radioStation;
	}

	public void setRadioStation(float radioStation) {
		System.out.println("Setting radio station to: "+radioStation);
		this.radioStation = radioStation;
	}
	
	public void on() {
		System.out.println("Turning on the music");
	}
	
	public void off() {
		System.out.println("Turning off the music");
	}
	
	
}
