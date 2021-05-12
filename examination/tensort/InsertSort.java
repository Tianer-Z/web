package examination.tensort;

import java.util.Arrays;

public class InsertSort {
    public static final int[] insertSort(int[] arrArray) {
        int[] arr = Arrays.copyOf(arrArray, arrArray.length);

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (i != j) {
                arr[j] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arrArray = new int[]{3, 1, 4, 2, 5, 0};

        int[] arr = insertSort(arrArray);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
