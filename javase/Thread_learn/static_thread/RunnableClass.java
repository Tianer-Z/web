package javase.Thread_learn.static_thread;

public class RunnableClass implements Runnable{
    private SynchronizedClass sync;

    public RunnableClass(SynchronizedClass sync) {
        this.sync = sync;
    }

    public void run() {
        System.out.println("线程 " + Thread.currentThread().getName() + " 尝试方法");
//        sync.methond2();
        SynchronizedClass.staticMethond1();
        System.out.println("线程 " + Thread.currentThread().getName() + " 结束");
    }
}
