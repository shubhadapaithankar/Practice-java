package com.company.commandpattern;

public class TvONCommand implements Command{

    private Receiver receiver;

    public TvONCommand(Receiver receiver){
        this.receiver=receiver;

    }


    @Override
    public void execute() {
        receiver.tvON();
    }
}
