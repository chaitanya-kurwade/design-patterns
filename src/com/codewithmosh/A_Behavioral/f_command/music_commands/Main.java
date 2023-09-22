package com.codewithmosh.A_Behavioral.f_command.music_commands;

import com.codewithmosh.A_Behavioral.f_command.music_commands.commands.EverythingOffCommand;
import com.codewithmosh.A_Behavioral.f_command.music_commands.commands.EverythingOnCommand;
import com.codewithmosh.A_Behavioral.f_command.music_commands.commands.KitchenLightsOffCommand;
import com.codewithmosh.A_Behavioral.f_command.music_commands.commands.KitchenLightsOnCommand;
import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.KitchenLights;
import com.codewithmosh.A_Behavioral.f_command.music_commands.hardware.Music;

public class Main {

	public static void main(String[] args) {
		AlexaDevice alexaDevice = new AlexaDevice();
		System.out.println(alexaDevice);
		
		
		
//      ---------------------------------------------------------------

        //Example 2 - Kitchen Lights on
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//
//        //Set the slots with new commands
//        alexa.setCommand(
//                0,
//                new KitchenLightsOnCommand(kitchenLights),
//                new KitchenLightsOffCommand(kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateSlot(0);
//        alexa.deactivateSlot(0);

//      ---------------------------------------------------------------

        //Example 3 - Everything on!
        AlexaDevice alexa = new AlexaDevice();

        //Create an instance
        KitchenLights kitchenLights = new KitchenLights();
        Music music = new Music();

        //Set the slots with new commands
        alexa.setCommand(
                1,
                new EverythingOnCommand(music, kitchenLights),
                new EverythingOffCommand(music, kitchenLights)
        );

        System.out.println(alexa);

        alexa.activateSlot(1);
        alexa.deactivateSlot(1);
	}
}
