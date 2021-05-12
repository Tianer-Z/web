package examination.juc;

import java.util.concurrent.*;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(3);

        FutureTask futureTask1 = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    sum += i;
                }
                Thread.sleep(1000);
                countDownLatch.countDown();
                return sum;
            }
        });

        FutureTask futureTask2 = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 11; i <= 20; i++) {
                    System.out.println(i);
                    sum += i;
                }
                Thread.sleep(1000);
                countDownLatch.countDown();
                return sum;
            }
        });

        FutureTask futureTask3 = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 21; i <= 30; i++) {
                    System.out.println(i);
                    sum += i;
                }
                Thread.sleep(1000);
                countDownLatch.countDown();
                return sum;
            }
        });

        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);
        Thread thread3 = new Thread(futureTask3);

        thread1.start();
        thread2.start();
        thread3.start();

        countDownLatch.await();
        Integer x = (Integer) futureTask1.get();
        Integer y = (Integer) futureTask2.get();
        Integer z = (Integer) futureTask3.get();
        System.out.println(x + y + z);

    }
}

