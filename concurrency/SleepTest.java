package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

class TestRunnable implements Runnable {

    public static final String getDateNow() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + getDateNow());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}


public class SleepTest {

    public static void main(String[] args) {
        Runnable runnable = new TestRunnable();
        Thread thread = new Thread(runnable, "嘻嘻");
        thread.start();
    }
}
