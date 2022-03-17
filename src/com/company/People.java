package com.company;

public class People {

    //class members

    private String name;
    private int age;
    private String address;

    //aggregation
    private Bicycle bicycle;
    private Religion religion;
    private Bicycle[] cycles;
    private Nationality[] nationalities;

    //static members
    private static int noOfHands = 2;


//    public  People(String name,int age,String address){
//        this.name=name;
//        this.age=age;
//        this.address=address;
//        this.bicycle= new Bicycle("red", "vinitModel");
//    }

    public  People(String name,int age,String address,Bicycle bicycle,Religion religion,Bicycle[] cycles ){
        this.name=name;
        this.age=age;
        this.address=address;
        this.religion=religion;
        this.bicycle=bicycle;
        this.cycles=cycles;
    }
    public People(String name,int age){
        this.name=name;
        this.age=age;
        this.address="101 South able Street";
    }
    public People(){
        this.name="Shubnit";
        this.age=30;
        this.address="100001 south SJSU";
    }

    //methods

    public String getName(){
        return this.name;
    }
    //public int handInfo(){
       // return noOfHands;
    //}

    public static int handInfoS(){
       //
        return noOfHands;
    }

    public void iterateOverArray(){ //definition/implementation

        System.out.println("for loop");

        for(int i = 0; i < this.cycles.length; i++) {

            System.out.println("the current cycle is :" + cycles[i]);
        }

        System.out.println("while loop");
        int j = 0;
        while (j < this.cycles.length){
            System.out.println("the current cycle is :" + cycles[j]);
            j++;
        }
        System.out.println("do while loop");
        int k = 0;
        do {
            System.out.println("the current cycle is :" + cycles[k]);
            k++;
        } while (k < this.cycles.length);
    }
}
