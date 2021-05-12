package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class MyRunnable implements Runnable {
    private String command;

    public MyRunnable(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(toString());
        System.out.println(Thread.currentThread().getName() + " Start.Time " + MyDate());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.Time " + MyDate());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String MyDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
        return sdf.format(new Date());
    }


    @Override
    public String toString() {
        return this.command;
    }
}



public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final Long KEEP_ALIVE_TIME = 1L;
    private static final int QUEUE_CAPACITY = 100;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 10; i++) {
            Runnable work = new MyRunnable("线程" + i);
            executor.execute(work);
        }

        executor.shutdown();
        while (!executor.isShutdown());
        System.out.println("Finished all threads");
    }

}
