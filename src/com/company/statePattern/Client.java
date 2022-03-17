package com.company.statePattern;

public class Client {
    public static void main(String args[]){
        F16 f16 = new F16();
        f16.park();
        f16.airborne();
        f16.crash();
        f16.land();
        f16.taxi();
    }
}
