package javase.Thread_learn.multi_threed;

public class PrintNumberThread extends Thread{
    private int times;

    public PrintNumberThread(int times) {
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + "\t:\t" + i);
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }
}
