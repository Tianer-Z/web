package bishi.tiqianpi.weilai;


public class Main01 {

    public int findLongest(int[] A, int n) {
        int res = 0;
        int[] dp = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Main01 solution = new Main01();
        System.out.println(solution.findLongest(new int[]{2, 1, 4, 3, 1, 5, 6}, 7));
    }

}
