package examination.somepoints;


class Person {

    public Person() {
        func();
    }

    public void func() {
        System.out.println("1, ");
    }

}


class Teacher extends Person {

    public Teacher() {
        super();
    }

    public Teacher(int a) {
        System.out.println(a);
    }

    @Override
    public void func() {
        System.out.print("2, ");
    }

}


public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher(3);
    }

}
