package com.company.commandpattern;

public class TvOffCommand implements Command{

    private Receiver receiver;

    public TvOffCommand(Receiver receiver){
        this.receiver=receiver;

    }

    @Override
    public void execute() {
        receiver.tvOff();
    }
}
