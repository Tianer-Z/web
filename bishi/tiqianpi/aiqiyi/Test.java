package bishi.tiqianpi.aiqiyi;

import java.util.Scanner;

public class Test {

    public static void fun(int[] nums, int k) {
        double maxn = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            int temp = sum - nums[i - k] + nums[i];
            double x = (temp - sum) * 1.0 / sum;
//            System.out.println(sum + " " + temp + " " + x);
            maxn = Math.max(maxn, x);
            sum = temp;
        }
        System.out.println(String.format("%.2f", maxn * 100) + "%");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replace(':', ',');
        String[] strs = str.split(",");

        int k = Integer.parseInt(strs[strs.length - 1]);
        int[] nums = new int[strs.length - 1];
        for (int i = 0; i < strs.length - 1; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        fun(nums, k);
    }
}
//5,6,8,26,50,48,52,55,10,1,2,1,20,5:3