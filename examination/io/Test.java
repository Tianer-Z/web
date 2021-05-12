package examination.io;



//public class Test {
//    public static void main(String[] args) {
//
//    }
//}



//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a + b);
//        }
//    }
//}



//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        while (T-- != 0) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a + b);
//        }
//    }
//}


//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            int res = 0;
//            for (int i = 1; i <= n; i++) {
//                res += scanner.nextInt();
//            }
//            System.out.println(res);
//        }
//
//    }
//}


//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            String[] nums = str.split(" ");
//            int res = 0;
//            for (String num : nums) {
//                res += Integer.parseInt(num);
//            }
//            System.out.println(res);
//        }
//
//    }
//}



//import java.util.Arrays;
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] strs = scanner.nextLine().split(" ");
//
//        Arrays.sort(strs);
//        for (int i = 0; i < strs.length; i++) {
//            if (i == 0) {
//                System.out.print(strs[i]);
//            } else {
//                System.out.print(" " + strs[i]);
//            }
//        }
//
//    }
//}


//import java.util.Arrays;
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            String[] strs = scanner.nextLine().split(" ");
//            Arrays.sort(strs);
//
//            for (int i = 0; i < strs.length; i++) {
//                if (i == 0) {
//                    System.out.print(strs[i]);
//                } else {
//                    System.out.print(" " + strs[i]);
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//}



//import java.util.Arrays;
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            String[] strs = scanner.nextLine().split(",");
//            Arrays.sort(strs);
//
//            for (int i = 0; i < strs.length; i++) {
//                if (i == 0) {
//                    System.out.print(strs[i]);
//                } else {
//                    System.out.print("," + strs[i]);
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//}



import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            System.out.println(x + y);
        }
    }
}