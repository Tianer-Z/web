package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

public class BLOCKED {
    private static AtomicBoolean obj = new AtomicBoolean();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (obj) {
                try {
                    Thread.sleep(100);
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread thread = new Thread(() -> {
            System.out.println("2 start()方法执行，线程的状态 " + Thread.currentThread().getState());
            synchronized (obj) {
                try {
                    Thread.sleep(100);
                    obj.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4 阻塞线程结束后，线程的状态 " + Thread.currentThread().getState());
        });

        System.out.println("1 new一个线程thread,start()之前，线程的状态 " + thread.getState());
        thread.start();

        Thread.sleep(50);
        System.out.println("3 线程阻塞后，线程的状态 " + thread.getState());

        Thread.sleep(300);
        System.out.println("5 线程结束后，线程的状态 " + thread.getState());
    }
}
