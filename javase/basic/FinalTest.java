package javase.basic;

class Father {
    public String str = "tianer";

    public Father() {
        System.out.println(str);
    }

    public static void say() {
        System.out.println("Father");
    }
}

class Son extends Father{
    Son() {
        System.out.println("Son");
    }
}

class FinalTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        Father.say();
//        Son.say();
        Son son = new Son();
    }
}
