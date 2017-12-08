package com.command.ex1;

/**
 * Created by david on 09/04/17.
 * Command Pattern -> we can encapsulate method invocation, it encapsulates a request
 * as an object ...
 * <p>
 * Good -> the object invoking the computation know nothing about the implementation
 * <p>
 * 4 components: command, receiver, invoker and client
 * <p>
 * Command: knows about receiver and invokes a method of the receiver
 * Values for parameters of the receiver method are stored in the command !!!
 * <p>
 * Receiver: does the work itself
 * <p>
 * Invoker: knows how to execute a command, and optionally does bookkeeping about the
 * command execution
 * The invoker does not know anything about a concrete command, it knows only about command interface !!!
 * <p>
 * Client:  The client decides which commands to execute at which points
 * To execute a command, it passes the command object to the invoker object
 */
public class App {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        Light light = new Light();
        TurnOnCommand onCommand = new TurnOnCommand(light);
        TurnOffCommand offCommand = new TurnOffCommand(light);

        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);

        switcher.executeCommands();

    }
}
