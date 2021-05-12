package examination.tensort;

import java.util.Arrays;
import java.util.Map;

public class ShellSort {

    public static final int[] shellSort(int[] arrArray) {
        int[] arr = Arrays.copyOf(arrArray, arrArray.length);
        int length = arr.length;

        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                int temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arrArray = new int[]{3, 1, 4, 2, 5, 0};

        int[] arr = shellSort(arrArray);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
