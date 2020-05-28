package com.command;

import java.util.ArrayList;

public class Demo {
    private Invoker invoker;

    public static void main(String[] args) {
        ArrayList<Command> list = new ArrayList<>();
        Receiver receiver = new Light("Bedroom");
        Command command1 = new TurnOnCommand(receiver);
        Invoker invoker = new Invoker(command1);
        list.add(command1);
        invoker.executeCommand();

        Receiver receiver2 = new Light("Kitchen");
        Command command2 = new TurnOffCommand(receiver2);
        list.add(command2);
        invoker.setCommand(command2);
        invoker.executeCommand();

        System.out.println("UNDO all commands");
        for (Command current: list){
            invoker.setCommand(current);
            invoker.undoCommand();
        }
    }
}
