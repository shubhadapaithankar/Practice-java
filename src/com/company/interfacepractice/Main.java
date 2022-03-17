package com.company.interfacepractice;

public class Main {

    public static void main (String[] args){
        int[] nums = new int[3];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        int[] nums2 = new int[4];
        char s = 's';
        char vin = 'v';
        s = 'm';
        People p1 = new Man("name",nums, s);
        People p2 = new Man("name",nums2,vin);
        People p3 = new Man();
        p1.printDescription();
        p2.printDescription();
        p3.printDescription();

        //using static variables
        People.noOfHAnds=3;
        System.out.println("value of static variable changed..");
        p1.printDescription();
        p2.printDescription();
        p3.printDescription();

        Sleeping s1= p1;
        Sleeping s2 =p2;
        s1.sleep(); // p1.sleep()
        s2.sleep(); // p2.sleep()

        Walking w1=p1;
        Walking w2=p2;
        Walking w3=p3;
        w1.walk();
        w2.walk();
        w3.walk();

        Running r1= new Man();
        r1.run();


    }
}
