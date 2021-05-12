package concurrency.JMM.visibility;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Visibility_Lock {
    private static boolean stop;
    private static Lock lock = new ReentrantLock(true);
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        //普通情况下，多线程不能保证可见性
        new Thread(() -> {
            System.out.println("Ordinary A is running...");
            lock.lock();
            try {
                condition.await();
                while (!stop);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("Ordinary A is terminated.");
        }).start();

        Thread.sleep(10);

        new Thread(() -> {
            System.out.println("Ordinary B is running...");
            lock.lock();
            try {
                stop = true;
                condition.signal();
            } finally {
                lock.unlock();
            }
            System.out.println("Ordinary B is terminated.");
        }).start();
    }
}
