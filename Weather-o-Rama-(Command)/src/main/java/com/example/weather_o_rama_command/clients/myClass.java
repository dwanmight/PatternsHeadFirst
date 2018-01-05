package com.example.weather_o_rama_command.clients;

import com.example.weather_o_rama_command.commands.GarageDoorOpenCommand;
import com.example.weather_o_rama_command.commands.LightOnCommand;
import com.example.weather_o_rama_command.initiators.SimpleRemoteControl;
import com.example.weather_o_rama_command.request_receivers.GarageDoor;
import com.example.weather_o_rama_command.request_receivers.Light;

public class myClass {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
