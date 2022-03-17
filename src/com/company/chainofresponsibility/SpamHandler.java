package com.company.chainofresponsibility;

public class SpamHandler implements Handler{

    private Handler next;
    @Override
    public void handleRequest(String email) {
        //this is handler request implementation for spam .
        if (email.contains("spam")){
            System.out.println("Request is handle by Spam handler....");
        }
        else{
            next.handleRequest(email);
        }
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;

    }
}
