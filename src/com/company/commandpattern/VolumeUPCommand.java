package com.company.commandpattern;

public class VolumeUPCommand implements Command{

    private Receiver receiver;

    public VolumeUPCommand(Receiver receiver){
        this.receiver=receiver;

    }


    @Override
    public void execute() {
        receiver.volumeUp();
    }
}
