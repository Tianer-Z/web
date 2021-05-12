package javase.test;

public class WaitAndNotify {

    public static final Object object = new Object();

    public static final Object object2 = new Object();

     static class T1 extends Thread {
        @Override
        public void run() {
            System.out.println("线程T1启动");
            synchronized (object) {
                try {
                    System.out.println("T1等待object锁");
                    object.wait();
                    System.out.println("object被唤醒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程T1结束");
        }
    }

     static class T2 extends Thread {
        @Override
        public void run() {
            System.out.println("线程T2启动");
            synchronized (object) {
                System.out.println("随机唤醒一条线程");
                object.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程T2结束");
            }



        }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
}