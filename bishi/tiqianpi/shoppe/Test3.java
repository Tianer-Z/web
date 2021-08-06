package bishi.tiqianpi.shoppe;

/**
 * @Author: Zhangsl
 * @Date: 2021/08/02
 */
public class Test3 {

    public int divide(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i >= j) {
                    dp[i][j] = dp[i - j][j] + dp[i - 1][j - 1];
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        int res = new Test3().divide(7, 3);
        System.out.println(res);
    }
}

