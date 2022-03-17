package com.company.gaspumpcommandpattern;

public class RedButton implements Command{
   private Receiver receiver;

   public RedButton(Receiver receiver){
       this.receiver=receiver;
   }

    @Override
    public void execute() {
       receiver.pressRed();

    }
}
