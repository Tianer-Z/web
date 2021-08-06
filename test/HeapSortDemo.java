package test;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/21
 */
public class HeapSortDemo {

    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        quickSort(0, nums.length - 1, target, nums);
        return nums[target];
    }

    public void quickSort(int left, int right, int target, int[] nums) {
        if (left >= right) {
            return;
        }
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

        if (i != left) {
            swap(i, left, nums);
        }
        if (i == target) {
            return;
        } else if (i < target) {
            quickSort(i + 1, right, target, nums);
        } else {
            quickSort(left, i - 1, target, nums);
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
        new HeapSortDemo().findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }

}

