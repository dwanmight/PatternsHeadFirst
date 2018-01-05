package com.example.weather_o_rama_command.commands;

import com.example.weather_o_rama_command.Command;
import com.example.weather_o_rama_command.request_receivers.Light;

/**
 * Created by ilya on 05.01.18.
 */

public class LightOffCommand implements Command {
    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override public void execute() {
        mLight.off();
    }
}
