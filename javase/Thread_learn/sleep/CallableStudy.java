package javase.Thread_learn.sleep;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        System.out.println(1111);
        Thread.sleep(1000);
        System.out.println(2222);
        return 123;
    }
}


public class CallableStudy {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

    }
}
