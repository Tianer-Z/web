package concurrency;

public class ThreadId {

    public static Thread getThreadById(Long threadId) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

        while (threadGroup != null) {
            Thread[] threads = new Thread[(int) (threadGroup.activeCount() * 1.2)];//activeCount估计值，线程可能动态改变
            int countt = threadGroup.enumerate(threads, true);
            for (int i = 0; i < countt; i++) {
                if (threadId == threads[i].getId()) {
                    return threads[i];
                }
            }
            threadGroup = threadGroup.getParent();
        }
        return null;
    }

    public static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程结束");
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread("haha");
        thread.start();

        Long threadId = thread.getId();
        System.out.println(threadId);
        Thread thread1 = getThreadById(threadId);
    }
}
