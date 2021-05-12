package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ActiveCount {
    public static class MyAtomicInteger {
        private AtomicInteger integer = new AtomicInteger();
        public void pulsOne() {
            integer.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        MyAtomicInteger myAtomicInteger = new MyAtomicInteger();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
               for (int j = 0; j < 1000; j++) {
                   myAtomicInteger.pulsOne();
//                   System.out.println("1.0 " + myAtomicInteger.integer.get());
               }
            }).start();
        }

        if (Thread.activeCount() >= 2) {
            System.out.println("2.0 " + Thread.activeCount());
            Thread.yield();
            System.out.println("3.0 " + Thread.activeCount());
        }

        /*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

        while (Thread.activeCount() > 2) {
            System.out.println(Thread.activeCount());
            Thread.yield();
        }
        System.out.println(myAtomicInteger.integer.get());
    }
}
