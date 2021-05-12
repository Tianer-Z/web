package examination.basic;

public class PrintThreeThread {
    private static int count = 1;
    private static final int END = 60;

    public static synchronized void print(int id) {
        while (count < END) {
            if (count / 5 % 3 == id) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + count++);
                }
                PrintThreeThread.class.notifyAll();
            } else {
                try {
                    PrintThreeThread.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    PrintThreeThread.print(finalI);
                }
            }, "t" + i).start();
        }
    }
}
