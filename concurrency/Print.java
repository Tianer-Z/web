package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Print {
    static class Resource {
        private static int count = 0;
        private Lock lock = new ReentrantLock();
        public void increment() {
            lock.lock();
            try {
                                count++;
                if (count == 11) {
                    count = 1;
                }
                System.out.println(Thread.currentThread().getName() + " " + count);

            } finally {
                lock.unlock();
            }


        }
//        private static Object obj = new Object();
//        public void increment() {
//            synchronized(obj) {
//                count++;
//                if (count == 11) {
//                    count = 1;
//                }
//                System.out.println(Thread.currentThread().getName() + " " + count);
//
//                obj.notify();
//                try {
//                    obj.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

    }


    public static void main(String[] args) {
        Resource resource = new Resource();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    resource.increment();
                }
            }
        }, "A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    resource.increment();
                }
            }
        }, "B").start();
    }

}
