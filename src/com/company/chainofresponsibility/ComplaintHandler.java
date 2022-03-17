package com.company.chainofresponsibility;

public class ComplaintHandler implements Handler{

    private Handler next;
    @Override
    public void handleRequest(String email) {
        if(email.contains("complaint")){
            System.out.println("Request is handle by Complaint handler....");
        }
        else{
            next.handleRequest(email);
        }

    }

    @Override
    public void setNext(Handler nextHandler) {
        this.next=nextHandler;
    }
}
