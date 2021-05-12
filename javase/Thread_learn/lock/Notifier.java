package Thread_learn.lock;

public class Notifier implements Runnable{
    private Object notifyObj;

    public Notifier(Object notifyObj) {
        this.notifyObj = notifyObj;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " 将挂起5s钟");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(name + " notify线程开始");
        synchronized (notifyObj) {
            notifyObj.notify();
        }
        System.out.println(name + " notify线程结束");

    }

}
