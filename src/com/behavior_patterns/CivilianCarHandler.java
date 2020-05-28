package com.behavior_patterns;

public class CivilianCarHandler extends AbstractHandler{
    @Override
    public void handle(String request) {
        if (request.equals("Civilian")){
            System.out.println("Stop");
            System.out.println("Go");
            return;
        }
        this.next.handle(request);
    }
}
