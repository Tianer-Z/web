package examination.juc;

public class TwoThread100 {
    private static Object obj = new Object();
    private static int count = 1;
    private static final int END = 101;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (count == END) {
                            obj.notifyAll();
                            return;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        try {
                            obj.notifyAll();
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (count == END) {
                            obj.notifyAll();
                            return;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        try {
                            obj.notifyAll();
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "t2");

        t1.start();
        t2.start();

    }
}
