package examination.tensort;

import java.util.Arrays;

public class BubbleSort {

    public static final int[] bubbleSort(int[] arrArray) {
        int[] arr = Arrays.copyOf(arrArray, arrArray.length);

        int length = arr.length;
        boolean flag = false;
        int sortBorder = length - 1;
        int lastIndex = 0;
        for (int i = 0; i < length; i++) {
            flag = false;
            for (int j = 0; j < sortBorder; j++) {
                System.out.println(i + " " + j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                    lastIndex = j;
                }
            }

            sortBorder = lastIndex;
            if (!flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrArray = new int[]{3, 4, 1, 2, 5, 0};
//        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr = bubbleSort(arrArray);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
