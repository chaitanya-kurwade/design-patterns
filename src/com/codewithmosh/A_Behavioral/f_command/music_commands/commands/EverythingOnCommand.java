package com.codewithmosh.A_Behavioral.f_command.music_commands.commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.KitchenLights;
import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.Music;

public class EverythingOnCommand implements Command{

	private KitchenLights kitchenLights;
	private Music music;
		
	public EverythingOnCommand(Music music, KitchenLights kitchenLights) {
		this.kitchenLights = kitchenLights;
		this.music = music;
	}
	
	@Override
	public void execute() {
		System.out.println("Its party time");
		kitchenLights.on();
		music.on();
		music.setRadioStation(0);
		music.setVolume(0);
	}
	
}
