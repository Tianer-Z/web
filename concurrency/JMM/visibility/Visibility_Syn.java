package concurrency.JMM.visibility;

public class Visibility_Syn {
    private static Object obj = new Object();
    private static boolean stop;

    public static void main(String[] args) throws InterruptedException {
        //普通情况下，多线程不能保证可见性
        new Thread(() -> {
            System.out.println("Ordinary A is running...");
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (!stop) ;
            }
            System.out.println("Ordinary A is terminated.");
        }).start();


        Thread.sleep(10);
        new Thread(() -> {
            System.out.println("Ordinary B is running...");
            synchronized (obj) {
                stop = true;
                obj.notify();
            }
            System.out.println("Ordinary B is terminated.");
        }).start();

    }

}
