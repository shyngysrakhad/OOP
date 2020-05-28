package com.behavior_patterns;

public class AbstractHandler implements Handler{
    protected Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {

    }
}
