package com.behavorial_patterns.observer;

public class Demo {
    public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice(new Magazine("New York Times"));
        Subscriber subscriber1 = new Subscriber("Steve");
        Subscriber subscriber2 = new Subscriber("John");
        Subscriber subscriber3 = new Subscriber("Berlin");

        postalOffice.subscribe(subscriber1);
        postalOffice.subscribe(subscriber2);
        postalOffice.subscribe(subscriber3);

        postalOffice.send();

        postalOffice.unsubscribe(subscriber1);
        System.out.println();
        postalOffice.setCurrent(new Magazine("Nur-Sultan Times"));
        postalOffice.send();
    }
}
