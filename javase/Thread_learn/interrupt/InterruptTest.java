package javase.Thread_learn.interrupt;


import java.util.Arrays;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread end");
        } catch (InterruptedException e) {
            System.out.println("哈哈");
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (!interrupted()) {
            System.out.println("1111");
        }
        System.out.println(2222);
    }
}

public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        String str = "123";
        System.out.println(str.indexOf(0));
//        Thread thread1 = new Thread( new MyRunnable());
//        thread1.start();
//        thread1.isInterrupted();
        Thread thread2 = new MyThread2();
        thread2.start();
        Thread.sleep(1000);
        thread2.interrupt();
    }
}
