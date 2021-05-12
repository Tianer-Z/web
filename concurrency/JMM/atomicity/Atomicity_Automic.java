package concurrency.JMM.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity_Automic {

    static class IncrementAuto {
        private AtomicInteger count = new AtomicInteger(0);
        public void increment() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        IncrementAuto increment = new IncrementAuto();

        for (int i = 0 ; i < 50000; i++) {
            new Thread(() -> {
                increment.increment();
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(increment.getCount());
    }

}
