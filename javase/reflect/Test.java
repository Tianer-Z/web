package javase.reflect;

public class Test {
    int aa;
    String cc;
    Test(int a, String c) {
        aa = a;
        cc = c;
    }
    static void haha(int a, double b) {
        System.out.println(1);
    }

    static void haha(double b, int a) {
        System.out.println(2);
    }


    public Test() {
    }

    static void fun(int a, String c) {
        System.out.println(a + c);
    }


    public static void main(String[] args) {
        System.out.println(1 + "222");
        fun(1, "a");
        Test test = new Test(1, "aa");
        haha(1, 1.1);
        haha(1.1, 1);
    }
}
