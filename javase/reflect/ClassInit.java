package javase.reflect;

public class ClassInit {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(A.m);

//        System.out.println(B.m);
//        B[] bs = new B[10];
//        System.out.println(B.pc);
//    }
        B.fun();
//        System.out.println(B.pc);

    }
}

class A {

    static {
        m = 300;
        System.out.println("A类静态代码块初始化" + A.m);
    }
    static int m = 100;

    public A() {
        System.out.println("A类无参构造方法初始化" + m);
    }
}

class B extends A {
    static {
        System.out.println("haha");
    }
    static final int pc = 1;

    static void fun() {
        System.out.println("B类静态方法初始化");
    }

    public B() {
        System.out.println("B类无参构造方法初始化");
    }
}