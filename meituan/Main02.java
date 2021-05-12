package examination.meituan;

import java.util.HashSet;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>(); // 1 经度
        HashSet<Integer> set1 = new HashSet<>(); // 0 纬度
        int count = 0; // 0 纬度
        for (int i = 1; i <= n; i++) {
            int t = scanner.nextInt();
            int x = scanner.nextInt();

            if (t == 0) {
                set1.add(x);
            } else {
                if (x >= 180) {
                    x -= 180;
                }
                set.add(x);
            }
        }

        int temp = set.size();
        int res = 0;
        if (temp == 0) {
            res = (set1.size() + 1) * 1;
        } else {
            res = (set1.size() + 1) * (2 * set.size());
        }
        System.out.println(res);
    }

}
