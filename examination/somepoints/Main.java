package examination.somepoints;

class Father {
    static {
        System.out.println("examination.somepoints.Father static");
    }

    public Father() {
        System.out.println("examination.somepoints.Father gouzao");
    }

    public static void fun() {
        System.out.println("111");
    }
}

class Son extends Father{
    static {
        System.out.println("examination.somepoints.Son static");
    }

    public Son() {
        System.out.println("examination.somepoints.Son gouzao");
    }
}


public class Main {
    public static void main(String[] args) {
        Father son = new Son();
    }
}