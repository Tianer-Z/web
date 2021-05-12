package tengxun;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int kk = 1; kk <= T; kk++){
            int n = scanner.nextInt();

            int res = 0;
            int[] maxn = new int[n + 10];
            Arrays.fill(maxn, Integer.MIN_VALUE);
            int[] a = new int[n + 10];

            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                int x = scanner.nextInt();
                maxn[a[i]] = Math.max(maxn[a[i]], x);
                res += x;
            }
            for (int i = 1; i <= n; i++) {
                if (maxn[i] != Integer.MIN_VALUE) {
                    res -= maxn[i];
                }
            }
            System.out.println(res);
        }
    }
}
