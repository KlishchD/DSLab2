package org.example.b;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private final LinkedList<Integer> items = new LinkedList<>();

    public synchronized void put(Integer item) {
        items.add(item);
    }

    public synchronized Integer take() {
        return items.poll();
    }

    public synchronized boolean hasNext() {
        return !items.isEmpty();
    }
}
