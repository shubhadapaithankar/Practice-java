package com.company.interfacepractice;

public class Man extends People{

    public Man(String name,int[] numbers,char character){
     super(name, numbers, character);
    }
    public Man(){
        super("vinit", new int[] {1,2}, 'c');
    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }
}
