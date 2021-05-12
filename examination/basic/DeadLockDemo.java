package examination.basic;

public class DeadLockDemo {

    private Object o1 = new Object();
    private Object o2 = new Object();

    public void fun1() {
        synchronized (o1) {
            System.out.println("fun1 o1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println("fun1 o2");
            }
        }
        System.out.println("fun1 end");
    }

    public void fun2() {
        synchronized (o2) {
            System.out.println("fun2 o2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                System.out.println("fun2 o1");
            }
        }
        System.out.println("fun2 end");
    }

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLockDemo.fun1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLockDemo.fun2();
            }
        }).start();

    }

}
