package concurrency.JMM.order;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Order_Lock {
    static String a1 = new String("A : x = x + 1");
    static String a2 = new String("A : x = x - 1");
    static String b1 = new String("B : x = x * 2");
    static String b2 = new String("B : x = x / 2");
    private static Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        new Thread(() -> {
            lock.lock();
            System.out.println(a1);
            System.out.println(a2);
            lock.unlock();
        }).start();

        new Thread(() -> {
            lock.lock();
            System.out.println(b1);
            System.out.println(b2);
            lock.unlock();
        }).start();
    }
}
