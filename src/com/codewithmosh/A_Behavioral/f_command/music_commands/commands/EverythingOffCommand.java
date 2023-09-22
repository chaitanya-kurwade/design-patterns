package com.codewithmosh.A_Behavioral.f_command.music_commands.commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.KitchenLights;
import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.Music;

public class EverythingOffCommand implements Command{


	private KitchenLights kitchenLights;
	private Music music;
		
	public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
		this.kitchenLights = kitchenLights;
		this.music = music;
	}
	
	@Override
	public void execute() {
		music.off();
		kitchenLights.off();
	}
}
