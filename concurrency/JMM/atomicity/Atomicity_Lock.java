package concurrency.JMM.atomicity;

import java.util.concurrent.locks.ReentrantReadWriteLock;



public class Atomicity_Lock {

    static class IncrementLock {
        private int count;
        private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);

        public void increment() {
            readWriteLock.writeLock().lock();
            try {
                count++;
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }

        public int getCount(){
            return count;
        }

    }


    public static void main(String[] args) throws InterruptedException {
        IncrementLock incrementLock = new IncrementLock();

        for (int i = 0 ; i < 50000; i++) {
            new Thread(() -> {
                incrementLock.increment();
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(incrementLock.getCount());
    }

}
