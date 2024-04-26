package lab8;

import java.util.Random;

public class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                System.out.println("Not enough products in the store.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("Consumer bought 1 product");
        System.out.println("Products in store: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        product += new Random().nextInt(3) + 1;
        System.out.println("Producer delivered products");
        System.out.println("Products in store: " + product);
        notify();
    }
}

class Producer implements Runnable {
    Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            store.get();
        }
    }
}

