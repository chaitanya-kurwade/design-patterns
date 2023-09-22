package com.codewithmosh.A_Behavioral.f_command.music_commands.commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.KitchenLights;

public class KitchenLightsOnCommand implements Command{
	private KitchenLights kitchenLights;
	public KitchenLightsOnCommand(KitchenLights kitchenLights) {
		this.kitchenLights = kitchenLights;
	}
	
	@Override
	public void execute() {
		kitchenLights.on();
	}

}
