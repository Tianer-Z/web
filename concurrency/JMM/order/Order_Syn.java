package concurrency.JMM.order;

public class Order_Syn {
    static String a1 = new String("A : x = x + 1");
    static String a2 = new String("A : x = x - 1");
    static String b1 = new String("B : x = x * 2");
    static String b2 = new String("B : x = x / 2");
    private static Object obj = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (obj) {
                System.out.println(a1);

                System.out.println(a2);
            }

        }).start();

        new Thread(() -> {
            synchronized (obj) {
                System.out.println(b1);
                System.out.println(b2);
            }
        }).start();
    }
}
