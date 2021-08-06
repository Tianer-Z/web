package examination.tensort;

public class HeapSort {

    public void sort(int[] nums) {
        int length = nums.length;
        buildMaxHeap(nums, length);
        for (int i = length - 1; i >= 0; i--) {
            swap(0, i, nums);
            heapify(0, i, nums);
        }
    }

    public void buildMaxHeap(int[] nums, int length) {
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(i, length, nums);
        }
    }

    public void heapify(int i, int length, int[] nums) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < length && nums[right] > nums[largest]) {
            largest = right;
        }
        if (i != largest) {
            swap(largest, i, nums);
            heapify(largest, length, nums);
        }
    }

    public void swap(int x, int y, int[] nums) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 4, 2, 5, 0};
        new HeapSort().sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
