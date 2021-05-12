package examination.tensort;

import java.util.Arrays;

public class CountingSort {

    public static int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int maxValue = arr[0];
        for (int num : arr) {
            maxValue = Math.max(maxValue, num);
        }

        int bucketlen = maxValue + 1;
        int[] bucket = new int[bucketlen];
        for (int num : arr) {
            bucket[num]++;
        }

        int index = 0;
        for (int i = 0; i < bucketlen; i++) {
            while (bucket[i] > 0) {
                arr[index++] = i;
                bucket[i]--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arrArray = new int[]{3, 1, 4, 2, 5, 0};

        int[] arr = sort(arrArray);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
