package com.company.decorator;

public class Soy extends Decorator{

    public Soy(Component component){
        super(component);
    }
    @Override
    public double cost() {
        double price = super.cost();
        return addedPrice(price);

    }

    @Override
    public double addedPrice(double price) {
        return price + 2.1;
    }}
