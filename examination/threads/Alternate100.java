package examination.threads;


public class Alternate100 {
    private static int number = 0;
    static class MyRunnable implements Runnable {
        private Object obj;

        MyRunnable(Object obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    if (number > 100) {
                        number = 0;
                    }
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new MyRunnable(obj), "A").start();
        new Thread(new MyRunnable(obj), "B").start();
    }
}
