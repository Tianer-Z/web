package javase.test.six;

public interface InterfaceExample {
    void func1();
    default  void func2(){
        System.out.println("func2");
    }
    int x = 123;
//     int y; // Variable 'y' might not have been initialized
    public int z = 0; // Modifier 'public' is redundant for interface

// private int k = 0; // Modifier 'private' not allowed here
// protected int l = 0; // Modifier 'protected' not allowed here
// private void fun3(); // Modifier 'private' not allowed here
}

class TestInterface implements InterfaceExample {

    @Override
    public void func1() {
    }

    @Override
    public void func2() {

    }

    public void ff() {

    }

    public static void main(String[] args) {
        InterfaceExample x = new TestInterface();
//        x.func3();
    }

}