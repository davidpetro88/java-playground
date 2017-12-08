package com.command.ex1;

/**
 * Created by david on 09/04/17.
 */
public class TurnOffCommand  implements Command {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}