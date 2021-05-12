package examination.io;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] scores = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            scores[i] = scanner.nextInt();
        }
        Arrays.sort(scores,1, n + 1);

        for (int k = scores[0]; k <= scores[n]; k++) {
            int index = 0;
            for (index = 1; index <= n; index++) {
                if (scores[index] > k) {
                    break;
                }
            }
            if (x <= (index - 1) && (index - 1) <= y && x <= (n - index + 1) && (n - index + 1) <= y) {
                System.out.println(k);
                return;
            }
        }
        System.out.println(-1);
    }
}
