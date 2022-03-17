package com.company.chainofresponsibility;

public interface Handler {
    public void handleRequest(String email);
    public void setNext(Handler handler);


}
