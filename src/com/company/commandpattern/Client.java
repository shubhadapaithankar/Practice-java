package com.company.commandpattern;

public class Client {

    public static void main (String args[]){
        Receiver tv = new TV();

        Command tvON = new TvONCommand(tv);
        Command tvOff = new TvOffCommand(tv);



        Command volumeUp = new VolumeUPCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);


        Invoker tvRemote = new TvRemote();

        tvRemote.setCommand("tvON", tvON);
        tvRemote.setCommand("tvOff", tvOff);
        tvRemote.setCommand("volumeUp",volumeUp);
        tvRemote.setCommand("volumeDown",volumeDown);

        tvRemote.execute("tvON");
        tvRemote.execute("tvOff");
        tvRemote.execute("volumeUp");
        tvRemote.execute("volumeDown");
        tvRemote.execute("tvOff");


    }
}
