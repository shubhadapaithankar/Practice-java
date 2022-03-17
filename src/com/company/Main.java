package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String colours1[] = {"red","blue","black"};
        String[] colours2 = {"red","blue","black"};
        String[] colours3 = new String[3];
        colours3[0] = "red";
        colours3[1] = "green";
        colours3[2] = "gray";

        String red = "red";
        String model = "Hero Honda";
        Bicycle bicycle1 = new Bicycle(red, model);
        Bicycle bicycle2 = new Bicycle(red, model);
        Bicycle bicycle3 = new Bicycle(red, model);
        Bicycle bicycle4 = new Bicycle(red, model);
        Bicycle bicycle5 = new Bicycle(red, null);
        Bicycle[] bicycles = new Bicycle[5];
        bicycles[0] = bicycle1;
        bicycles[1]= bicycle2;
        int[] numbers = new int[5];
        char[] charactors = new char[3];
        Religion[] religions = new Religion[3];
        Religion religion = new Religion();
        People p1 = new People();
        People p2 = new People("Shubhada", 27);
        People p3 = new People("Vinit", 30, "xyzhkwhdledlwkjdlwkjd", bicycle1, religion, bicycles);
        System.out.println("This is P2" + p2.getName());
        p3.iterateOverArray();
    }
}
