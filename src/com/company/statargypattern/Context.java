package com.company.statargypattern;

public class Context {

    private Isort howDoIsort;
    public Context(Isort howDoIsort){
        this.howDoIsort=howDoIsort;
    }

    public void sort (int[] numbers){
        howDoIsort.sort(numbers);
    }

    public void setHowDoIsort(Isort howDoIsort){
        this.howDoIsort=howDoIsort;
    }
}
