package examination.tensort;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(0, arr.length - 1, temp, arr);
    }

    public void sort(int left, int right, int[] temp, int[] arr) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(left, mid, temp, arr);
        sort(mid + 1, right, temp, arr);
        merge(left, mid, right, temp, arr);
    }

    public void merge(int left, int mid, int right, int[] temp, int[] arr) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int t = left;
        while (i <= mid && j <= right) {
            if (temp[i] < temp[j]) {
                arr[t++] = temp[i++];
            } else {
                arr[t++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[t++] = temp[i++];
        }
        while (j <= right) {
            arr[t++] = temp[j++];
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 4, 2, 5, 0};
        new MergeSort().sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
