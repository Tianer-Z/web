package javase.basic;

import java.util.HashSet;
import java.util.Objects;

public class EqualExample implements Cloneable{
    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualExample that = (EqualExample) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public EqualExample clone() throws CloneNotSupportedException {
        return (EqualExample) super.clone();
    }

    public static void main(String[] args) {
        EqualExample e1 = new EqualExample(1,1,1);
        EqualExample e2 = new EqualExample(1,1,1);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.toString());

        HashSet<EqualExample> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);
        System.out.println(hashSet.size());

        EqualExample e3 = null;
        try {
            e3 = e1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(e3 == e1);
        System.out.println(e3.equals(e1));
        System.out.println(e3.hashCode());
        System.out.println(e1);

        e1.setX(2);
        System.out.println(e3.getX());
        System.out.println(e1.getX());
    }


}
