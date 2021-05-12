package tengxun;

import java.util.Scanner;

public class Solution4 {
    public static boolean Jishu(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean Oushu(String s1, String s2) {
        int len = s1.length();
        String a1 = s1.substring(0, len / 2);
        String a2 = s1.substring(len / 2, len);
        String b1 = s2.substring(0, len / 2);
        String b2 = s2.substring(len / 2, len);

        return (Judge(a1, b1) && Judge(a2, b2)) || (Judge(a1, b2) && Judge(a2, b1));
    }

    public static boolean Judge(String s1, String s2) {
        if (s1.length() % 2 == 1) {
            return Jishu(s1, s2);
        } else {
            return Oushu(s1, s2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());

        for (int kk = 1; kk <= T; kk++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            if (Judge(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
