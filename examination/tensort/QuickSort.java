package examination.tensort;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/20
 */
public class QuickSort {

    public void sort(int[] nums) {
        quickSort(0, nums.length - 1, nums);
    }

    public void quickSort(int left, int right, int[] nums) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int pivot = nums[left];

        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            swap(i, j, nums);
        }

        swap(left, i, nums);
        quickSort(left, i - 1, nums);
        quickSort(i + 1, right, nums);
    }

    public void swap(int x, int y, int[] nums) {
        if (x != y) {
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
        }
    }

    public static void main(String[] args) {
        int[] soureArray = new int[]{3, 1, 4, 2, 5, 0};
        new QuickSort().sort(soureArray);

        for (int num : soureArray) {
            System.out.print(num + " ");
        }
    }

}
