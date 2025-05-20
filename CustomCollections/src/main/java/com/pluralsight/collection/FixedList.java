package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(this.maxSize);
    }

    public void add(T item) {
        if (maxSize <= items.size()) {
            System.out.println("Can't go over maxSize");
        } else {
            this.items.add(item);
        }
     }

    public List<T> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "FixedList{" +
                "items=" + items +
                ", maxSize=" + maxSize +
                '}';
    }
}
