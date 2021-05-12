package javase.Thread_learn.static_thread;

public class Test {

    public static void main(String[] args) {
        SynchronizedClass sync = new SynchronizedClass();
        SynchronizedClass sync1 = new SynchronizedClass();

        Runnable runnableClass1 = new RunnableClassTwo(sync);
        Runnable runnableClass2 = new RunnableClass(sync);
//        RunnableClassTwo runnableClass2 = new RunnableClassTwo(sync);

        Thread thread1 = new Thread(runnableClass1, "线程1");
        Thread thread2 = new Thread(runnableClass2, "线程2");
        thread1.start();
        thread2.start();

    }

}