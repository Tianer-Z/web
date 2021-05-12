package baidu;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = str.charAt(i) - '0';
        }
        int[] dp = new int[n];
        HashMap<Integer, Integer> map = new HashMap();
        dp[0] = 0;
        map.put(nums[0], 0);

        for (int i = 1; i < n; i++) {
            int x = dp[i - 1];
            int y = Integer.MAX_VALUE;
            if (map.containsKey(nums[i])) {
                y = dp[map.get(nums[i])];
            }
            dp[i] = Math.min(x, y) + 1;
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(nums[i] + " " + dp[i]);
//        }
        System.out.println(dp[n - 1]);
    }
}
