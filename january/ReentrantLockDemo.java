package january;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private ReentrantLock lock = new ReentrantLock();

    public void fun() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();

        }
    }

    public static void main(String[] args) {
//        ReentrantLockDemo demo = new ReentrantLockDemo();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(() -> demo.fun());
//        executorService.execute(() -> demo.fun());


        CountDownLatch countDownLatch = new CountDownLatch(10);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                countDownLatch.countDown();
                System.out.println("haha" + countDownLatch.getCount());

                try {
                    countDownLatch.await();
                    System.out.println("end");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }



        executorService.shutdown();
    }

}
