package javase.test;

public class Demo {

    class A {
        int x = 6;
        private int y = 2;

        public A(int a) {
            x = a;
        }

        int getz() {
            int z;
            z = x / y;
            return z;
        }

        void show() {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            System.out.println("z=" + getz());
            System.out.println("=======================");
        }
    }

    class B extends A {
        int x = 3, y = 5, z;

        public B(int a) {
            super(a);
        }

        int getz() {
            z = x + y;
            return z;
        }

        public void getSuper() {
            System.out.println("my " + x);
            System.out.println("super" + super.x);

        }

    }


    public void fun() {
        A num1 = new A(10);
        B num2 = new B(9);

        num1.show();

        num2.getSuper();
        num2.show();

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.fun();
    }
}
