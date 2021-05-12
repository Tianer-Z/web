package examination.io;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Arrays.sort(a, 2, n + 1);
        int res = 0;
        int index = 3;
        Queue<Integer> queue = new LinkedList<>();
        res += a[1] * a[2];
        queue.offer(a[2]);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (index > n) {
                break;
            }
            int x = a[index++];
            res += cur * x;
            queue.offer(x);
            System.out.println(cur + " " + x);

            if (index > n) {
                break;
            }
            x = a[index++];
            res += cur * x;
            queue.offer(x);

            System.out.println(cur + " " + x);
        }
        System.out.println(res);
    }
}
