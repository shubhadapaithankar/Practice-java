package com.company;

public class Bicycle {
    private String colour;
    private String model;

    public Bicycle(String colour,String model) {
        this.colour=colour;
        this.model=model;

    }


    public String getColour(){
        return colour;
    }
    public String getModel(){
        return model;
    }
}
