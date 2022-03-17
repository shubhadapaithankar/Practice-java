package com.company.commandpattern;

public class VolumeDownCommand implements Command{

    private Receiver receiver;

    public VolumeDownCommand(Receiver receiver){
        this.receiver=receiver;

    }

    @Override
    public void execute() {
     receiver.volumeDown();
    }

}
