package com.company.decorator;

public abstract class  Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component=component;
    }

    public abstract double addedPrice(double price);

    public double cost() {
        return component.cost();
    }
}
