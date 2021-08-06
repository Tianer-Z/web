package bishi.tiqianpi.aiqiyi;


import java.util.*;

public class Test02 {

    public static int[] fun(int[] rains) {
        int[] res = new int[rains.length];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> queue = new LinkedList<>();
        for (int idx = 0; idx < rains.length; idx++) {
            int lake = rains[idx];
            if (lake == 0) {
                queue.add(idx);
                continue;
            }
            if (map.containsKey(lake)) {
                if (queue.isEmpty()) {
                    return new int[0];
                }
                Integer fullLakeIdx = map.get(lake);
                boolean flag = false;
                for (int noRaindx : queue) {
                    if (noRaindx > fullLakeIdx) {
                        res[noRaindx] = lake;
                        queue.remove(noRaindx);
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    return new int[0];
                }
            }
            res[idx] = -1;
            map.put(lake, idx);
        }
        while (!queue.isEmpty()) {
            res[queue.pop()] = 1;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.substring(1, str.length() - 1);
        String[] strs = str.split(",");
        int[] res = new int[strs.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(strs[i]);
        }

        res = fun(res);
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
//[1,2,0,0,2,1]