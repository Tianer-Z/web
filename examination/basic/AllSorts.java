package examination.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllSorts {

    public static <T> void fun (T[] nums) {
        for (T num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 6, 5, 4);

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();



        //====================================
        Integer[] integers = new Integer[]{3, 1, 2, 6, 5, 4};

        Arrays.sort(integers);
        fun(integers);

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        fun(integers);




        //=============================

        int[] arrays = new int[]{3, 1, 2, 6, 5, 4};

        Arrays.sort(arrays);
        for (int integer : arrays) {
            System.out.print(integer + " ");
        }
        System.out.println();



        Integer[] arrays1 = new Integer[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays1[i] = arrays[i];
        }
        Arrays.sort(arrays1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = arrays1[i];
        }

        for (int integer : arrays) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }


}
