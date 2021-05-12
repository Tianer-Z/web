package classlibrary;

import java.util.concurrent.CountDownLatch;

class Task implements Runnable {
    private CountDownLatch countDownLatch;

    public Task(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "已到达" + System.currentTimeMillis());
        countDownLatch.countDown();
    }
}



public class CountDownLatchDemo {
    private void go() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Task(countDownLatch), "Thread1").start();
        Thread.sleep(1000);
        new Thread(new Task(countDownLatch), "Thread2").start();
        Thread.sleep(1000);
        new Thread(new Task(countDownLatch), "Thread3").start();
        countDownLatch.await();
        System.out.println("所有线程已到达，主线程开始执行" + System.currentTimeMillis());
    }

    public static void main(String[] args) throws InterruptedException {
        new CountDownLatchDemo().go();
    }

}
