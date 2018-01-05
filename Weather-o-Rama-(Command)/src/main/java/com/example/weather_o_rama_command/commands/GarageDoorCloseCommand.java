package com.example.weather_o_rama_command.commands;

import com.example.weather_o_rama_command.Command;
import com.example.weather_o_rama_command.request_receivers.GarageDoor;

/**
 * Created by ilya on 05.01.18.
 */

public class GarageDoorCloseCommand implements Command {
    private GarageDoor mGarageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        mGarageDoor = garageDoor;
    }

    @Override public void execute() {
        mGarageDoor.lightOff();
        mGarageDoor.down();
    }

    @Override public void undo() {
        mGarageDoor.lightOn();
        mGarageDoor.up();
    }
}
