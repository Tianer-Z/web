package examination.tensort;

import java.util.Arrays;

public class HeapSort {

    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        buildMaxHeap(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr,0, i);
            heapify(arr, 0, i);
        }
        return arr;
    }

    public void buildMaxHeap(int[] arr) {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0 ; i--) {
            heapify(arr, i, len);
        }
    }

    public void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] sourceArray = new int[]{3, 1, 4, 2, 5, 0};
        int[] arr = new HeapSort().sort(sourceArray);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
