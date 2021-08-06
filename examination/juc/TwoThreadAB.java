package examination.juc;

public class TwoThreadAB {
    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    System.out.println("A");
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    obj.notify();
                    try {
                        System.out.println("B");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        Thread.sleep(100);
        threadB.start();
    }

}

