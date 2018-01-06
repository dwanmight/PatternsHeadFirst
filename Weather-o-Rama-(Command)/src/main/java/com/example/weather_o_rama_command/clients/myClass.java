package com.example.weather_o_rama_command.clients;

import com.example.weather_o_rama_command.Command;
import com.example.weather_o_rama_command.commands.GarageDoorCloseCommand;
import com.example.weather_o_rama_command.commands.GarageDoorOpenCommand;
import com.example.weather_o_rama_command.commands.LightOffCommand;
import com.example.weather_o_rama_command.commands.LightOnCommand;
import com.example.weather_o_rama_command.commands.MacroCommand;
import com.example.weather_o_rama_command.initiators.RemoteControl;
import com.example.weather_o_rama_command.initiators.SimpleRemoteControl;
import com.example.weather_o_rama_command.request_receivers.GarageDoor;
import com.example.weather_o_rama_command.request_receivers.Light;

public class myClass {
    public static void main(String[] args) {
//        startSimpleSample();
//        startSample();
        startMacroSample();
    }

    private static void startSimpleSample() {
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

    private static void startSample() {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.println(remoteControl.toString() + "\n");

        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonPushed();
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonPushed();
    }

    private static void startMacroSample() {
        RemoteControl macroRemoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        MacroCommand macronOnCommand = new MacroCommand(new Command[]{lightOnCommand, garageDoorOpenCommand});
        MacroCommand macroOffCommand = new MacroCommand(new Command[]{lightOffCommand, garageDoorCloseCommand});

        macroRemoteControl.setCommand(0, macronOnCommand, macroOffCommand);

        macroRemoteControl.onButtonWasPressed(0);
        macroRemoteControl.offButtonWasPressed(0);
    }
}
