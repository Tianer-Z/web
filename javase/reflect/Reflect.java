package javase.reflect;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("javase.reflect.User");
        System.out.println(c1);

        Class c2 = Class.forName("javase.reflect.User");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        User user = new User();
        User user2 = new User();
        System.out.println(user.a);
        System.out.println(user.toString() + " " + user.hashCode());
        System.out.println(user2.toString() + " " +user2.hashCode());

    }
}

class User {
    private String name;
    int id;
    int age;
    int a = 10;
    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private static int setName() {
        return 666;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
//    @Override
//    public String toString() {
//        System.out.println("1111");
//        return "2222";
//    }

}
