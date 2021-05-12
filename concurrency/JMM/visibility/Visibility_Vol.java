package concurrency.JMM.visibility;

public class Visibility_Vol {
    private static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        //普通情况下，多线程不能保证可见性
        new Thread(() -> {
            System.out.println("Ordinary A is running...");
            while (!stop);
            System.out.println("Ordinary A is terminated.");
        }).start();

        Thread.sleep(10);

        new Thread(() -> {
            System.out.println("Ordinary B is running...");
            stop = true;
            System.out.println("Ordinary B is terminated.");
        }).start();
    }
}
