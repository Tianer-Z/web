package examination;

class A {
    private int a = fun();
    static {
        System.out.println(1);
    }
    public int fun() {
        System.out.println(2);

        return 1;
    }
}

public class Test01 {
    public static void main(String[] args) {
        new A();
        new A();
    }
}
