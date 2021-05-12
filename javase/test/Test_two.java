package javase.test;

public class Test_two {

    static class Father {

        public void fun() {
            System.out.println("Father");
        }

    }

    static class SubClass extends Father{
        public void fun (){
            System.out.println("subclass");
        }

        public void funB() {
            System.out.println("2");
        }
    }


    public void test(Father father) {
        System.out.println("father");
        System.out.println(father.getClass().getName());
    }

    public void test(SubClass subClass) {
        System.out.println("subclass");
        System.out.println(subClass.getClass().getName());
    }

    public static void main(String[] args) {
        Test_two test_two = new Test_two();

        Father father = new Father();
        test_two.test(father);

        SubClass subClass = new SubClass();
        test_two.test(subClass);

        father = subClass;
        test_two.test(father);
    }
}
