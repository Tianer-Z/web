package meituan;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int res = 0;
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            if (judge(x, k)) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean judge(int x, int k) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                builder.append(i);
                if (i == k) {
                    return true;
                }
            }
        }

        String str = builder.toString();
        int itr = str.length() - 1;

        while (k != 0 && itr >= 0) {
            int temp =  k % 10;
            while (itr >= 0 && str.charAt(itr) != (temp + '0')) {
                itr--;
            }
            k /= 10;
            itr--;
        }

        if (k == 0) {
            return true;
        }

        return false;
    }

}
