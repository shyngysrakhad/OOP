package com.iterator;

public class CustomIterableCollectionIterator implements Iterator {
    private CustomIterableCollection collection;
    private int currentIndex = -1;
    private int collectionSize;

    public CustomIterableCollectionIterator(CustomIterableCollection collection) {
        this.collection = collection;
        this.collectionSize = collection.getSize();
    }

    @Override
    public String getNext() {
        currentIndex++;
        return this.collection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasNext() {
        return currentIndex + 1 < collectionSize;
    }
}
