package examination;

public class Demo {


    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("进入A");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2) {
                        System.out.println("进入B");
                    }
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println("进入B");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1) {
                        System.out.println("进入A");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
