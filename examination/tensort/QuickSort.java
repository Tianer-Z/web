package examination.tensort;

import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        quickSort(0, arr.length - 1, arr);
        return arr;
    }

    public static void quickSort(int low, int high, int[] arr) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;
        quickSort(low, j - 1, arr);
        quickSort(j + 1, high, arr);
    }

    public static void main(String[] args) {
        int[] soureArray = new int[]{3, 1, 4, 2, 5, 0};
        int[] arr = sort(soureArray);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
