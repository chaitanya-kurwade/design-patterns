package com.codewithmosh.A_Behavioral.f_command.music_commands.commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.Music;

public class MusicOnCommand implements Command{

	private Music music;
	
	public MusicOnCommand(Music music) {
		this.music = music;
	}
	
	@Override
	public void execute() {
		music.on();
		music.setRadioStation(99.9f);
		music.setVolume(67);
	}
}
