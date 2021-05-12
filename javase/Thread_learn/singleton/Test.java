package Thread_learn.singleton;

public class Test {
    public static void main(String[] args) {

//        Thread currtenThread = Thread.currentThread();
//        System.out.println(currtenThread.getName());

//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(111);
            }
        });
        thread.start();
    }
}
