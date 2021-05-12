package examination.exam;

class Father {
    final static int x = 1;
    final public void fun() {
        System.out.println(111);
    }
    final public void fun(int x) {

    }
}

class Son extends Father {
    static int x = 2;
    public void fun(char x) {
        System.out.println(222);
        this.fun();
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
