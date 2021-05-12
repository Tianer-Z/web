package concurrency.JMM.atomicity;




public class Atomicity_Syn {
        static class IncrementSyn {
            private int count;
            public synchronized void increment() {
                count++;
            }
            public int getCount() {
                return count;
            }
        }

        public static void main(String[] args) throws InterruptedException {
        IncrementSyn incrementSyn = new IncrementSyn();

        for (int i = 0 ; i < 50000; i++) {
            new Thread(() -> {
                incrementSyn.increment();
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(incrementSyn.getCount());
    }


}
