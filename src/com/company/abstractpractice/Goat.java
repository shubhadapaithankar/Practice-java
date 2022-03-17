package com.company.abstractpractice;

public class Goat extends Animal{

    private String[] noOFGots ;
    private int legs = 4;

    public  Goat(String[] array, int time5){
        this.noOFGots=array;
    }


    @Override
    public void run() {
        System.out.println("Running");
    }


    public void walk() {

    }

    public void walk(int[] animalWalks){
        char s= 'a';
        String a= null;
        String[] brr= new String[4];
        String[] crr = new String[5];
        System.out.println("Walking");

    }
}
