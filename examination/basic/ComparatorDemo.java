package examination.basic;


import java.util.*;

public class ComparatorDemo {

    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            if (this.age >= o.getAge()) {
                return 1;
            } else  {
                return -1;
            }

        }
    }

    static class PerSonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.getAge() > o2.getAge()) {
                return  1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        TreeMap<Person, String> pdata = new TreeMap<Person, String>(new PerSonComparator());
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        pdata.put(new Person("王五", 10), "wangwu");
        pdata.put(new Person("⼩红", 5), "xiaohong");
        pdata.put(new Person("红", 5), "xiaohong");
        // 得到key的值的同时得到key所对应的值
        Set<Person> keys =  pdata.keySet();
        for (Person key : keys) {
            System.out.println(key.getAge() + "-" + key.getName());
        }


    }
}
