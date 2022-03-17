package com.company.chainofresponsibility;

public class Client {


    public static void main (String args[]){
        Handler h1 = new SpamHandler();
        Handler h2 = new FanHandler();
        Handler h3 = new ComplaintHandler();
        Handler h4 = new DefaultHandler();



        h1.setNext(h2);
        h2.setNext(h3);

        h3.setNext(h4);

        String email = "Hello, This is a spam email";
        h1.handleRequest(email);
        email="hello";
        h1.handleRequest(email);
    }
}
