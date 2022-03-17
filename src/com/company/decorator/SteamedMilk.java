package com.company.decorator;

public class SteamedMilk extends Decorator{
    public SteamedMilk(Component component) {
        super(component);
    }

    @Override
    public double cost() {
        double price = super.cost();
        return addedPrice(price);
    }

    @Override
    public double addedPrice(double price) {
        return price + 2.3;
    }
}
