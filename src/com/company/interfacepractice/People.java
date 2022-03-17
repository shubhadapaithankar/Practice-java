package com.company.interfacepractice;

public abstract class People implements Running,Sleeping,Walking {
    private String name;
    public static int noOfHAnds = 2;
    private int[] numbers;
    private char character;

    public People(String name,int[] numbers,char character){
        this.name=name;
        this.numbers=numbers;
        this.character=character;
    }
    public People(){
        this.name="Shubhada";
        this.numbers= new int[]{1, 2, 3};
    }
    public String getName() {
        return name;
    }

    public int[] getNumbers(){
        return numbers;
    }

    public void printDescription(){
        System.out.println("Details of People class..." );
        System.out.println("name........."  +name);
        System.out.println("number of Hands...."  +noOfHAnds);
        System.out.println("this is the array........");
        for (int i =0; i<this.numbers.length; i++){
            System.out.println("the numbers are......." +numbers[i]);
        }
        System.out.println("value of character is......." +character);
    }

    @Override
    public void run() {
        System.out.println("Running");
    }


}
