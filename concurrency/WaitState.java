package concurrency;

class Resource {
    int num = 0;

    public synchronized void AA() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " 进入AA");

        System.out.println(Thread.currentThread().getName() + " 开始notify");
        notify();
        System.out.println(Thread.currentThread().getName() + " 完成notify");

        System.out.println(Thread.currentThread().getName() + " 开始wait");
        wait();
        System.out.println(Thread.currentThread().getName() + " 完成wait");

        System.out.println(Thread.currentThread().getName() + " 退出AA");
    }

    public synchronized void BB() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " 进入BB");

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " 开始notify");
        notify();
        System.out.println(Thread.currentThread().getName() + " 完成notify");
        Thread.sleep(2000);

        System.out.println(Thread.currentThread().getName() + " 开始wait");
        wait();
        System.out.println(Thread.currentThread().getName() + " 完成wait");

        System.out.println(Thread.currentThread().getName() + " 退出BB");
    }
}


public class WaitState {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        Thread thread1 = new Thread(() -> {
            try {
                resource.AA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread thread2 = new Thread(() -> {
            try {
                resource.BB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println(thread1.getName() + " " + thread1.getState());
        Thread.sleep(2000);
        System.out.println(thread1.getName() + " " + thread1.getState());
    }

}

