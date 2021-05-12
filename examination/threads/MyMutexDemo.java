package examination.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyMutexDemo {

    private static CyclicBarrier barrier = new CyclicBarrier(31);
    private static int sum = 0;
    private static MyMutex mutex = new MyMutex();

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                for (int i1 = 0; i1 < 1000; i1++) {
                    increment1();
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println(sum);
        sum = 0;

        barrier.reset();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                for (int i1 = 0; i1 < 1000; i1++) {
                    increment2();
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println(sum);
    }


    public static void increment1() {
        sum++;
    }

    public static void increment2() {
        mutex.lock();
        sum++;
        mutex.unlock();
    }
}
