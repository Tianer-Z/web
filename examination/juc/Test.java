package examination.juc;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/23
 */
public class Test {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("进入A0");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("进入A1");
                }
            }
        }, "线程A");

        Thread threadB = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("进入B0");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("进入B1");
                }
            }
        }, "线程B");

        threadA.start();
        threadB.start();
    }

}
