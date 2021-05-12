package tengxun;

import java.util.*;

class AA {
    int id;
    int k;
    int time;

    public AA(int id, int k, int time) {
        this.id = id;
        this.k = k;
        this.time = time;
    }
}

public class Solution22 {
    public static void main(String[] args) {
        PriorityQueue<AA> queue = new PriorityQueue<AA>(new Comparator<AA>() {
            @Override
            public int compare(AA o1, AA o2) {
                if (o1.time == o2.time) {
                    return o1.id - o2.id;
                }
                return o1.time - o2.time;
            }
        });

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            int k = scanner.nextInt();
            queue.offer(new AA(i, k, k));
        }


        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            AA temp = queue.poll();
            res.add(temp.id);
            queue.offer(new AA(temp.id, temp.k, temp.time + temp.k));
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
