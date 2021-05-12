package javase.Thread_learn.static_thread;

public class SynchronizedClass {
    public synchronized static void staticMethond1() {
        System.out.println(Thread.currentThread().getName() + "staticMethond1开始");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "staticMethond1结束");
    }

    public synchronized static void staticMethond2() {
        System.out.println(Thread.currentThread().getName() + "staticMethond2 开始");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "staticMethond2 结束");
    }

    public synchronized void methond1() {
        System.out.println(Thread.currentThread().getName() + "methond1 开始");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "methond1 结束");
    }

    public synchronized void methond2() {
        System.out.println(Thread.currentThread().getName() + "methond2 开始");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "methond2 结束");
    }

}
