package concurrency.JMM.order;

public class Order {
    static String a1 = new String("A : x = x + 1");
    static String a2 = new String("A : x = x - 1");
    static String b1 = new String("B : x = x * 2");
    static String b2 = new String("B : x = x / 2");

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println(a1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a2);
        }).start();

        new Thread(() -> {
            System.out.println(b1);
            System.out.println(b2);
        }).start();
    }
}
