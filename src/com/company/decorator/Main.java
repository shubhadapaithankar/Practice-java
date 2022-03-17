package com.company.decorator;

public class Main {
    public static void main (String args[]){

        Component coffee = new SteamedMilk(new Soy(new DarkRoast()));
        double cost = coffee.cost();
        System.out.println(cost);
        System.out.println("This is the final cost");

    }
}
