package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

public class WAITING {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean obj = new AtomicBoolean(false);

        Thread thread = new Thread( () -> {
            System.out.println("2 线程thread.start()执行后，线程的状态 " + Thread.currentThread().getState());
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4 obj.notify()执行后,线程的状态 " + Thread.currentThread().getState());
        });

        System.out.println("1 线程通过new初始化一个线程,但是还没start之前，线程的状态 " + thread.getState());
        thread.start();

        Thread.sleep(100);
        System.out.println("3 执行obj.wait()方法之后 " + thread.getState());

        new Thread( () -> {
            synchronized (obj) {
                obj.notify();
            }
        }
        ).start();


        Thread.sleep(100);
        System.out.println("5 线程运行结束,线程的状态 " + thread.getState());
    }
}
