package examination;

/**
 * @Author: Zhangsl
 * @Date: 2021/08/04
 */
public class Test {
    public static Object obj = new Object();
    public static int count = 1;
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        obj.notify();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        },"线程A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        obj.notify();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        },"线程B");


        threadA.start();
        threadB.start();
    }
}
