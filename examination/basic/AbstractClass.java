package examination.basic;


import java.util.AbstractList;
import java.util.LinkedList;

public abstract class AbstractClass implements InterfaceClass{
    AbstractClass(int x){this.x = x;}
    int x;
    public int fun() {
        return 0;
    }
}

class HH extends AbstractClass{

    HH(int x) {
        super(x);
    }

    public static void main(String[] args) {
    }

    @Override
    public int fun1() {
        return 0;
    }
}