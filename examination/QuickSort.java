package examination;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/29
 */
public class QuickSort {

    public List<Integer> sort(int[] nums, int k) {
        int target = nums.length - k;
        quickSort(0, nums.length - 1, nums, target);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = nums.length - k; i  < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

    public void quickSort(int left, int right, int[] nums, int target) {
        int pivot = nums[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            swap(i, j, nums);
        }
        swap(i, left, nums);

        if (i == target) {
            return;
        }
        if (i <= target) {
            quickSort(i + 1, right, nums, target);
        } else {
            quickSort(left, i - 1, nums, target);
        }
    }

    public void swap(int x, int y, int[] nums) {
        if (x != y) {
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
        }
    }



    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 3, 2, 4, 109};
        List<Integer> res = new QuickSort().sort(nums, 3);
        for (Integer re : res) {
            System.out.println(re);
        }
    }


}
