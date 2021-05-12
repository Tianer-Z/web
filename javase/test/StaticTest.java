package javase.test;

public class StaticTest {
     class A {
        public void show(A obj) {
            System.out.println("A.show(A)");
        }
        public void show(C obj) {
            System.out.println("A.show(C)");
        }
    }

     class B extends A {
        public void show(A obj) {
            System.out.println("B.show(A)");
        }
    }

     class C extends B { }
     class D extends C { }


    public void hha() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.show(a);
        a.show(b);
        a.show(c);
        a.show(d);
        System.out.println("====================");


        b.show(a);
        b.show(b);
        b.show(c);
        b.show(d);
        System.out.println("========================");


        A ba = new B();
        ba.show(a);
        ba.show(b);
        ba.show(c); // A.show(C)
        ba.show(d); // A.show(C)

    }



    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        staticTest.hha();
    }


}
