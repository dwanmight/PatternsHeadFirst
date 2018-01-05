package com.example.weather_o_rama_command.commands;

import com.example.weather_o_rama_command.Command;
import com.example.weather_o_rama_command.request_receivers.GarageDoor;

/**
 * Created by ilya on 05.01.18.
 */

public class GarageDoorOpenCommand implements Command {
    private GarageDoor mGarageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        mGarageDoor = garageDoor;
    }

    @Override public void execute() {
        mGarageDoor.up();
        mGarageDoor.lightOn();
    }

    @Override public void undo() {
        mGarageDoor.down();
        mGarageDoor.lightOff();
    }
}
