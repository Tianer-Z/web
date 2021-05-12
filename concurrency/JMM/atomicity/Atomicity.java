package concurrency.JMM.atomicity;



public class Atomicity {
    static class Increment {
        private int count = 0;
        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
//    public static void main(String[] args) throws InterruptedException {
//        Increment increment = new Increment();
//
//        for (int i = 0 ; i < 50000; i++) {
//            new Thread(() -> {
//                increment.increment();
//            }).start();
//        }
//
//        Thread.sleep(2000);
//        System.out.println(increment.getCount());
//    }
    private static boolean stop;
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("A is running");
            while(!stop);
            System.out.println("A is terminated");
        }).start();

        new Thread(() -> {
            System.out.println("B is running");
            stop = true;
            System.out.println("B is terminated");
        }).start();

    }

}
