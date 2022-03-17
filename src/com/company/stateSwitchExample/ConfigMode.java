package com.company.stateSwitchExample;

public class ConfigMode implements State{

    private Switch switch1;

    public ConfigMode(Switch switch1){
        this.switch1 = switch1;
    }
    @Override
    public void enable() {

    }

    @Override
    public void terminal() {

    }

    @Override
    public void end() {

    }
}
