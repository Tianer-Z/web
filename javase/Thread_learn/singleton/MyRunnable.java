package Thread_learn.singleton;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("另一个线程");
    }
}
