package com.behavorial_patterns.command;

public class TurnOnCommand implements Command{
    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.on();
    }

    @Override
    public void undo() {
        this.receiver.off();
    }
}
