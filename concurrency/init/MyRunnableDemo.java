package concurrency.init;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

 class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return 12;
    }
}

public class MyRunnableDemo {
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("11");
        }
    }



    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(111);
        }
    }



    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myRunnable, new Integer(1));
        Thread thread1 = new Thread(futureTask);
        thread1.start();

        try {
            Integer x = futureTask.get();
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        Thread thread2 = new MyThread();
        thread2.start();



    }

}
