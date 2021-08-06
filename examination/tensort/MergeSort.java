package examination.tensort;

public class MergeSort {

    public void sort(int[] nums) {
        int[] temp = new int[nums.length];
        sort(0, nums.length - 1, nums, temp);
    }

    public void sort(int left, int right, int[] nums, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(left, mid, nums, temp);
        sort(mid + 1, right, nums, temp);
        mergeSort(left, mid, right, nums, temp);
    }

    public void mergeSort(int left, int mid, int right, int[] nums, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int i = left;
        int j = mid + 1;
        int index = left;

        while (i <= mid || j <= right) {
            if (i <= mid && j <= right) {
                nums[index++] = temp[i] < temp[j] ? temp[i++] : temp[j++];
            } else {
                nums[index++] = i <= mid ? temp[i++] : temp[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 4, 2, 5, 0};
        new MergeSort().sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
