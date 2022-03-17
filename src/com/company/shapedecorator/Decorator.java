package com.company.shapedecorator;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component){
        this.component=component;
    }

   // public abstract void setBorder();

    public void draw(){
        component.draw();
    }
}
