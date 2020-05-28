package com.behavorial_patterns.observer;

public interface IPostalOffice {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void send();
    void update(Magazine m);
}
