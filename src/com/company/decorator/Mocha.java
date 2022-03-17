package com.company.decorator;

public class Mocha extends Decorator{

    public Mocha(Component component){
        super(component);
    }
    @Override
    public double cost() {
        double price = super.cost();
        return addedPrice(price);
    }

    @Override
    public double addedPrice(double price) {
        return price + 0.35;
    }
}
