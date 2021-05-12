package january;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("haha");
                Thread.sleep(1000);
                return 123;
            }
        };
        FutureTask<Integer> ft = new FutureTask<>(callable);

        Thread thread = new Thread(ft);
        thread.start();
        Integer x = ft.get();
        System.out.println(x.getClass());
        System.out.println(x);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,10,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.shutdown();


        Thread thread1 = new Thread(ft);
        thread1.setDaemon(true);

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        int count = threadGroup.activeCount();
        Thread[] threads = new Thread[count];
        threadGroup.enumerate(threads);

        System.out.println(count);
        for (Thread thread2 : threads) {
            System.out.println(thread2.getName() + thread2.isDaemon());
        }


    }

}
