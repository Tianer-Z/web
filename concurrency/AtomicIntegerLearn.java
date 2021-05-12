package concurrency;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerLearn {
    private static AtomicInteger a = new AtomicInteger();

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    int temp = a.incrementAndGet();
                    System.out.println(temp);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i].start();
        }
    }

}
