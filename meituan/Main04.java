package meituan;

import java.util.HashSet;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];

        int maxn = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = scanner.nextInt();
                set.add(temp);
                maxn = Math.max(maxn, temp);
            }
        }

        if (set.size() != maxn) {
            System.out.println("-1");
        } else {
            System.out.println("999");
        }

    }
}
