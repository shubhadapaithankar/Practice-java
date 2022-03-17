package com.company.stateSwitchExample;

public class ExecMode implements State{

    private Switch switch1;
    public ExecMode(Switch switch1){
        this.switch1=switch1;
    }
    @Override
    public void enable() {
        switch1.setState(switch1.getPriviledgeModeState());
        System.out.println("This is enable now");

    }

    @Override
    public void terminal() {

    }

    @Override
    public void end() {
        switch1.setState(switch1.getPriviledgeModeState());
        System.out.println("The state end");

    }
}
