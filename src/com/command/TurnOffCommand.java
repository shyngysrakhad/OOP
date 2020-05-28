package com.command;

public class TurnOffCommand implements Command{
    private Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.off();
    }

    @Override
    public void undo() {
        this.receiver.on();
    }
}
