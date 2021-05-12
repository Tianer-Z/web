package javase.IO_study;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;

class A implements Serializable{
    private int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }
}

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A(1);
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        String objectFile = "F:\\a";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
        objectOutputStream.writeObject(a);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
        a = (A) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(a.toString());
        System.out.println(a.hashCode());

        System.out.println(1<<0);
    }

}
