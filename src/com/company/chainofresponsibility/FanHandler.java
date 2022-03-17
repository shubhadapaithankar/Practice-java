package com.company.chainofresponsibility;

public class FanHandler implements Handler{

    private Handler next;
    @Override
    public void handleRequest(String email) {
        if(email.contains("Fan")){
            System.out.println("Request is handle by Fan HAndler");
        }
        else {
            next.handleRequest(email);
        }

    }

    @Override
    public void setNext(Handler nextHandler) {
        this.next=nextHandler;
    }
}
