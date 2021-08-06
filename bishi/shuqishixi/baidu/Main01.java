package bishi.shuqishixi.baidu;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        long[] nums = new long[(2 * n) + 100];

        for (int i = 0; i < (2 * n); i++) {
            nums[i] = scanner.nextLong();
        }
        Arrays.sort(nums, 0, 2 * n);

        long x = 0;
        long y = 0;
        if (n == 1) {
            x = nums[0];
            y = nums[1];
        }
        long res = y * p + x * (100 - p);
        if (res % 100 == 0) {
            System.out.println(res/100);
        } else {
            System.out.println(res + "%");
        }

    }
}
