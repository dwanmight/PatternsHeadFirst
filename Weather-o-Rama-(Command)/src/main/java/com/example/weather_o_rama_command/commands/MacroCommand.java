package com.example.weather_o_rama_command.commands;

import com.example.weather_o_rama_command.Command;

/**
 * Created by ilya on 06.01.18.
 */

public class MacroCommand implements Command {
    private Command[] mCommands;

    public MacroCommand(Command[] commands) {
        mCommands = commands;
    }

    @Override public void execute() {
        for (int i = 0; i < mCommands.length; i++) {
            mCommands[i].execute();
        }
    }

    @Override public void undo() {
        for (int i = 0; i < mCommands.length; i++) {
            mCommands[i].undo();
        }
    }
}
