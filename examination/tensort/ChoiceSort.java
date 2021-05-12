package examination.tensort;

import java.util.Arrays;

public class ChoiceSort {

    public static int[] choiceSort(int[] arrArray) {
        int[] arr = Arrays.copyOf(arrArray, arrArray.length);

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (i != index) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrArray = new int[]{3, 1, 4, 2, 5, 0};

        int[] arr = choiceSort(arrArray);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
