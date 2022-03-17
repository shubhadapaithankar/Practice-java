package com.company.stateSwitchExample;

public class Switch {

    private State state;
    private ConfigMode configMode = new ConfigMode(this);
    private ExecMode execMode = new ExecMode(this);
    private PriviledgeMode priviledgeMode = new PriviledgeMode(this);

    public Switch(){
        this.state=execMode;
    }

    public void setState(State state){
        this.state=state;
    }



    public State getConfigModeState(){
        return configMode;
    }
    public State getExecModeState(){
        return  execMode;
    }

    public State getPriviledgeModeState(){
        return priviledgeMode;
    }

    public void endState(){
        state.end();
    }

    public void enableState(){
        state.enable();
    }

    public  void tarminalState(){
        state.terminal();
    }
}
