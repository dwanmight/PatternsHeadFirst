package com.example.weather_o_rama_command.clients;

import com.example.weather_o_rama_command.commands.GarageDoorCloseCommand;
import com.example.weather_o_rama_command.commands.GarageDoorOpenCommand;
import com.example.weather_o_rama_command.commands.LightOffCommand;
import com.example.weather_o_rama_command.commands.LightOnCommand;
import com.example.weather_o_rama_command.initiators.RemoteControl;
import com.example.weather_o_rama_command.request_receivers.GarageDoor;
import com.example.weather_o_rama_command.request_receivers.Light;

public class myClass {
    public static void main(String[] args) {
//        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
//
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
//
//        simpleRemoteControl.setCommand(lightOnCommand);
//        simpleRemoteControl.buttonWasPressed();
//        simpleRemoteControl.setCommand(garageDoorOpenCommand);
//        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();


        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.printf(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
    }
}
