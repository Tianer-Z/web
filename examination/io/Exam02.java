package examination.io;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums, 1, n + 1);
        int res = 0;
        for (int i = 1; i <=n; i++) {
            res += Math.abs(i - nums[i]);
        }
        System.out.println(res);
    }
}
