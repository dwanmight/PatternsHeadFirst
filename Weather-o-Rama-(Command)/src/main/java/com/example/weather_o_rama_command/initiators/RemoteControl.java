package com.example.weather_o_rama_command.initiators;

import com.example.weather_o_rama_command.Command;

/**
 * Created by ilya on 05.01.18.
 */

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (isSlotValid(slot)) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void onButtonWasPressed(int slot) {
        if (isSlotValid(slot)) {
            onCommands[slot].execute();
        }
    }

    public void offButtonWasPressed(int slot) {
        if (isSlotValid(slot)) {
            offCommands[slot].execute();
        }
    }

    public boolean isSlotValid(int slot) {
        return (slot >= 0 && slot <= onCommands.length);
    }

    @Override public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---REmote Control---\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("slot ");
            stringBuffer.append(i);
            if (onCommands[i] != null) {
                stringBuffer.append(onCommands[i].getClass().getName().toString());
            } else {
                stringBuffer.append("on is NULL; ");
            }
            if (offCommands[i] != null) {
                stringBuffer.append(offCommands[i].getClass().getName().toString());
            } else {
                stringBuffer.append("off is NULL; ");
            }
        }
        return stringBuffer.toString();
    }
}
