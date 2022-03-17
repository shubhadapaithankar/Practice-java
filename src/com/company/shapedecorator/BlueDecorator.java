package com.company.shapedecorator;

public class BlueDecorator extends Decorator{
    public BlueDecorator(Component component) {
        super(component);
    }

    public void draw(){
        component.draw();
        setBlueBorder(component);

    }


    public void setBlueBorder(Component component) {
        System.out.println("Border colour: Blue");

    }

}


