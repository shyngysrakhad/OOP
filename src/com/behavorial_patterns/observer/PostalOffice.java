package com.behavorial_patterns.observer;

import java.util.ArrayList;

public class PostalOffice implements IPostalOffice{
    private Magazine current;
    ArrayList<Subscriber> subscribers;


    public PostalOffice(Magazine current) {
        this.current = current;
        this.subscribers = new ArrayList<>();
    }

    public void setCurrent(Magazine current) {
        this.current = current;
    }

    public Magazine getCurrent() {
        return current;
    }

    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void send() {
        for (Subscriber s: subscribers){
            s.update(current);
        }
    }

    @Override
    public void update(Magazine m) {
        this.current = m;
        send();
    }

}
