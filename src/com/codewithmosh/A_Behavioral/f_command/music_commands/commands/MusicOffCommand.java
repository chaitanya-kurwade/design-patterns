package com.codewithmosh.A_Behavioral.f_command.music_commands.commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.Music;

public class MusicOffCommand implements Command{

	private Music music;
	
	public MusicOffCommand(Music music) {
		this.music = music;
	}
	
	@Override
	public void execute() {
		music.setRadioStation(0);
		music.setVolume(0);
		music.off();		
	}

}
