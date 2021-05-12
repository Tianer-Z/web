package classlibrary;

public class ExceptionPerformance {
    public static void testException(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (NullPointerException e) {
            System.out.println("array cannot be null");
        }
    }

    public static void testIf(String[] args) {
        if (args != null) {
            System.out.println(args[0]);
        } else {
            System.out.println("array cannot be null");
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        testException(null);
        testIf(null);
        System.out.println(System.nanoTime() - start);
    }
}
