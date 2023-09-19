package org.example.b;

import java.util.LinkedList;
import java.util.Random;

public class ProducerConsumerApp {
    public ProducerConsumerApp(int itemCount) {
        LinkedList<Integer> items = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < itemCount; ++i) {
            items.add(random.nextInt(1, 1000));
        }

        Queue queue = new Queue();
        Producer producer = new Producer(items, queue);
        Consumer consumer = new Consumer(queue);


        producer.start();
        consumer.start();
    }
}
