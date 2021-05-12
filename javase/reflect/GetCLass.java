package javase.reflect;

public class GetCLass {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.toString());

        Class c1 = person.getClass();
        Class c2 = Student.class;
        Class c3 = Class.forName("javase.reflect.Student");
        Class c4 = Integer.TYPE;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        super("学生");
    }
}

class Teacher extends Person {
    public Teacher() {
        super("教师");
    }
}
