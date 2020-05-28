package com.behavorial_patterns.iterator;

import java.util.ArrayList;

public class CustomIterableCollection implements IterableCollection {
    private ArrayList<String> data = new ArrayList<>();

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    public CustomIterableCollection(){
        data.add("Hello");
        data.add("My");
        data.add("World");
    }

    @Override
    public Iterator createIterator() {
        return new CustomIterableCollectionIterator(this);
    }

    public String getStringAtIndex(int index){
        return data.get(index);
    }

    public int getSize(){
        return data.size();
    }

}
