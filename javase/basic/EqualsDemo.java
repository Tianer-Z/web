package javase.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Rectangle implements Cloneable{
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

}


public class EqualsDemo {
    public static void main(String[] args) {
        Rectangle x = new Rectangle(1,1);
        Rectangle y = new Rectangle(1,1);

        System.out.println(x.equals(y));

        HashSet<Rectangle> hashSet = new HashSet<>();
        hashSet.add(x);
        hashSet.add(y);
        System.out.println(hashSet.size());

        try {
            Rectangle z = x.clone();
            System.out.println(x == z);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
