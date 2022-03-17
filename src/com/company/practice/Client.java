package com.company.practice;

public class Client {
    public static void main(String args[]){
        Context c1 = new Context();
        c1.printState();
        c1.goNext();
        c1.printState();


        c1.goNext();
        c1.printState();


    }
}
