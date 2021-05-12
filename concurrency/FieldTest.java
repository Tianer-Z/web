package concurrency;


class Person {
    static int eyeNum;
    String name;
    int age;

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class FieldTest {
    public static void main(String[] args) {
        // 类变量属于该类本身，只要改类初始化完成，程序即可使用类变量
        Person.eyeNum = 2; // ①

        // 通过Person类访问 eyeNum类变量
        System.out.println("Person的eyeNum属性：" + Person.eyeNum);

        // 创建第一个Person对象
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.age = 22;

        System.out.println("通过p1变量访问eyeNum类变量：" + p1.eyeNum); // ②
        p1.info();

        // 创建第二个Person对象
        Person p2 = new Person();
        p2.name = "lisi";
        p2.age = 30;
        p2.info();

        // 通过p2修改Person类的eyeNum类变量
        p2.eyeNum = 4; // ③

        System.out.println("通过p1变量访问eyeNum类变量：" + p1.eyeNum);
        System.out.println("通过p2变量访问eyeNum类变量：" + p2.eyeNum);
        System.out.println("通过Person类访问eyeNum类变量：" + Person.eyeNum);
    }
}