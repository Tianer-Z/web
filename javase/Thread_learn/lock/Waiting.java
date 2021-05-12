package Thread_learn.lock;

public class Waiting implements Runnable{
    private Object waitObj;

    public Waiting(Object waitObj) {
        this.waitObj = waitObj;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + " 将进入挂起状态，等待其他进程唤醒");
        try {
            synchronized (waitObj) {
                waitObj.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " 被唤醒了");
    }

}