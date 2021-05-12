package javase.Thread_learn.static_thread;

public class RunnableClassTwo implements Runnable{
    private SynchronizedClass sync;

    public RunnableClassTwo(SynchronizedClass sync) {
        this.sync = sync;
    }

    public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "尝试方法");
        sync.methond1();
//        SynchronizedClass.staticMethond2();
        System.out.println("线程" + Thread.currentThread().getName() + "结束");
    }
}
