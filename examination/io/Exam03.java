package examination.io;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        while (T-- != 0) {
            PriorityQueue<Integer> queue0 = new PriorityQueue<>();
            PriorityQueue<Integer> queue1 = new PriorityQueue<>();
            int n = Integer.parseInt(scanner.nextLine());
            String str = scanner.nextLine();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    queue0.offer(i + 1);
                } else if (str.charAt(i) == '1') {
                    queue1.offer(i + 1);
                }
            }

            n = Integer.parseInt(scanner.nextLine());
            str = scanner.nextLine();
            int temp;
            StringBuffer res = new StringBuffer("");
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'M') {
                    if (!queue1.isEmpty()) {
                        temp = queue1.poll();
                    } else {
                        temp = queue0.poll();
                        queue1.offer(temp);
                    }
                } else {
                    if (!queue0.isEmpty()) {
                        temp = queue0.poll();
                        queue1.offer(temp);
                    } else {
                        temp = queue1.poll();
                    }
                }
                res.append(temp + "\n");
            }
            System.out.print(res);
        }

    }

}