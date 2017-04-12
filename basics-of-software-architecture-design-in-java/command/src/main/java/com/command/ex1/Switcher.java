package com.command.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 09/04/17.
 */
//invoker
public class Switcher {
    public List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void executeCommands(){
        this.commands.forEach(command -> {
            command.execute();
        });
    }
}
