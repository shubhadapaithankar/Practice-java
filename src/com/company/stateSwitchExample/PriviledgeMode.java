package com.company.stateSwitchExample;

public class PriviledgeMode implements State{
    private Switch switch1;

    public PriviledgeMode(Switch switch1){
        this.switch1=switch1;
    }
    @Override
    public void enable() {


    }

    @Override
    public void terminal() {
        switch1.setState(switch1.getConfigModeState());
        System.out.println("Config terminal state");

    }

    @Override
    public void end() {
        switch1.setState(switch1.getExecModeState());
        System.out.println("The state end");

    }
}
