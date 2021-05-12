package concurrency;

public class Demo {

    static class Resource {
        int num = 0;

        public synchronized void increment() {
            num++;
            if (num == 11) {
                num = 1;
                System.out.println("");
            }
            System.out.println(Thread.currentThread().getName() + " " + num);

            System.out.println("开始notify");
            notify();
            System.out.println("完成notify");
            try {
                System.out.println("准备wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(() -> {
            while (true) {
                resource.increment();
            }
        },"tA").start();

        new Thread(() -> {
            while (true) {
                resource.increment();
            }
        },"tB").start();
    }

}
