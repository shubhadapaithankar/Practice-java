package com.company.chainofresponsibility;

public class DefaultHandler implements Handler{


    @Override
    public void handleRequest(String email) {
        System.out.println("The request is handle by Default Handler");

    }

    @Override
    public void setNext(Handler handler) {

    }
}
