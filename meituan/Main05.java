package examination.meituan;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            int temp =  scanner.nextInt();
            sum += temp;
            max = Math.max(max, sum);
        }
        res += max;
        res = Math.max(res, 0);

        max = Integer.MIN_VALUE;
        sum = 0;
        for (int i = 1; i <= b; i++) {
            int temp =  scanner.nextInt();
            sum += temp;
            max = Math.max(max, sum);
        }
        res += max;

        res = Math.max(res, 0);
        System.out.println(res);
    }
}
