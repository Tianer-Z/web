package concurrency;

public class TIMED_WAITING {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( () -> {
            System.out.println("2 线程执行thread.start()之后，线程的状态 " + Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4 线程执行Thread.sleep()后，线程的状态 " + Thread.currentThread().getState());
        });


        System.out.println("1 通过new初始化一个线程，但是还没start之前，线程的状态 " + thread.getState());
        thread.start();
        Thread.sleep(500);
        System.out.println("3 线程执行Thread.sleep()时，线程的状态 " + thread.getState());
        Thread.sleep(1000);
        System.out.println("5 线程执行完毕，线程的状态 " + thread.getState());
    }
}
