package org.example.b;

import java.util.LinkedList;
import java.util.List;

public class Producer extends Thread {

    private final LinkedList<Integer> items;
    private final Queue queue;

    Producer(LinkedList<Integer> items, Queue queue) {
        this.items = items;
        this.queue = queue;
    }

    @Override
    public void run() {
        Integer item = items.poll();
        while (item != null) {
            queue.put(item);
            item = items.poll();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
