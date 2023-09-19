package org.example.b;

public class Consumer extends Thread {
    private final Queue queue;
    private int cost = 0;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (isAlive()) {
            if (queue.hasNext()) {
                cost += queue.take();

                System.out.println("New total price: " + cost);
            }
        }
    }
}
