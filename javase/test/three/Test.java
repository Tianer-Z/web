package javase.test.three;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new LinkedHashMap<>();

        char[] sc = s.toCharArray();
        for (Character c : sc) {
            map.put(c, !map.containsKey(c));
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }

        return ' ';
    }


    public static double myPow(double x, int n) {
        double res = 1;
        if (n < 0) {
            x = 1.0 / x;
            long bb =  - (long) n;
            System.out.println(1-n);
            System.out.println(bb);

            n = -n;
        }
        System.out.println(x + " " +n);
        while (n > 0) {
            if ((n & 1) == 1) {
                res *= x;
            }
            x *= x;
            n >>= 1;
        }

        return res;
    }

    public static void main(String[] args) {

//        ConsoleWriter consoleWriter = new ConsoleWriter();
//        MyWriter writer1 = new MyWriter(consoleWriter, "线程1");
//        MyWriter writer2 = new MyWriter(consoleWriter, "线程2");
//
//        writer1.start();
//        writer2.start();
        HashMap<Character, Boolean> map = new HashMap<>();

        System.out.println(myPow(2.00000, -2147483648));

    }
}
