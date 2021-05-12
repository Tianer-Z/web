package javase.test.six;

public class Son extends Father{
//    @Override
    public static void staticMetod() {
        System.out.println("son");
    }

    @Override
    public void dynamicMetod() {
        System.out.println("son");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.staticMetod();
        son.dynamicMetod();

        Father father = new Son();
        father.staticMetod();
        father.dynamicMetod();

        Son son1 = (Son) father;
    }

}
