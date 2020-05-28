package com.iterator;

public class Demo {
    public static void main(String[] args) {
        IterableCollection collection = new CustomIterableCollection();
        Iterator iterator = collection.createIterator();
        String total = "";
        while (iterator.hasNext()){
            total += iterator.getNext();
        }
        System.out.println(total);
    }
}
