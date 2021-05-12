package Thread_learn.lock;

public class SimpleWaitNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        Waiting waiting = new Waiting(obj);
        Notifier notifier = new Notifier(obj);

        Thread waitingThread = new Thread(waiting, "挂起线程");
        Thread notifierThread = new Thread(notifier, "唤醒线程");

        notifierThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitingThread.start();

    }
}
