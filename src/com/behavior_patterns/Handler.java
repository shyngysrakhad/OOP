package com.behavior_patterns;

public interface Handler {
    void setNext(Handler next);
    void handle(String request);
}
