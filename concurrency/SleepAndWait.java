package concurrency;

public class SleepAndWait {
    public static Object obj = new Object();

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (obj) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    try {
//                        Thread.sleep(1000);
                        obj.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "thread1");
        Thread thread2 = new Thread(new MyRunnable(), "thread2");
        thread1.start();
        thread2.start();
    }

}
