package concurrency.JMM;

public class SynchronizedField {

    private static Object obj = new Object();

    static class Increment {
        private static int count = 0;
//        private static Object obj = new Object();

//        public void autoIncrement() {
//            synchronized (obj) {
//                for (int i = 0; i < 5; i++) {
//                    count++;
//                }
//                System.out.println(Thread.currentThread().getName() + " count: " + count);
//            }
//        }

        public static synchronized void autoIncrement() {
            for (int i = 0; i < 5; i++) {
                count++;
            }
            System.out.println(Thread.currentThread().getName() + " count: " + count);
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Increment increment = new Increment();

        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 1) {
                new Increment().autoIncrement();
            } else {
                new Thread(() -> {
                    increment.autoIncrement();
                }).start();
            }
        }

    }

}
