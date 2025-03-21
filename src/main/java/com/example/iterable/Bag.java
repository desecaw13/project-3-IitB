package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
