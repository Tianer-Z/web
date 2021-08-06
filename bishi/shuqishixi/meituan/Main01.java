package bishi.shuqishixi.meituan;

import java.util.*;

public class Main01 {
    private static final int MOD = 20210101;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        HashMap<Integer, HashSet<Integer>> map  = new HashMap<>();



        int res = judge(str.length());
        System.out.println(res);
    }

    public static int judge(int x ){
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= 2;
            res = res % MOD;
        }
        return res;
    }
}
