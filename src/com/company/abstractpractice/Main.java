package com.company.abstractpractice;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        String[] arry = new String[3];


//        ArrayList<String> list = new ArrayList<>();
//        list.add("shubhu");
//        list.add("babu");
//        list.remove(0);
        int[] animalWalk = new int[2];
        int time5=3;
        Animal a1= new Goat(arry,time5);
        Snake s1= new Kobra();
        s1.walk(animalWalk);
        s1.run();
    }

}
