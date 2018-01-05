package com.example.weather_o_rama_command.initiators;

import com.example.weather_o_rama_command.Command;

/**
 * Created by ilya on 05.01.18.
 */

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
