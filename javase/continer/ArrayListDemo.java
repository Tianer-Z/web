package javase.continer;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println(3^1);
        Integer [] array = {1,2,3};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(array));
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        int index = 1;
        array[++index] = 9;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("===================");
        int[] a = {0, 1, 2};
        int[] b = {3, 4, 5};
        System.arraycopy(a,0,b,0,1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
