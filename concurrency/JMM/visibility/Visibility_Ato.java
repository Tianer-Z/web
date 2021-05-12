package concurrency.JMM.visibility;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Visibility_Ato {
    private static AtomicBoolean stop = new AtomicBoolean(false);

    public static void main(String[] args) throws InterruptedException {
        //普通情况下，多线程不能保证可见性
        new Thread(() -> {
            System.out.println("Ordinary A is running...");
            while (!stop.get());
            System.out.println("Ordinary A is terminated.");
        }).start();

        Thread.sleep(10);

        new Thread(() -> {
            System.out.println("Ordinary B is running...");
            stop.set(true);
            System.out.println("Ordinary B is terminated.");
        }).start();
    }
}
