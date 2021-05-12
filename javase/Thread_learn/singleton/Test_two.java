package Thread_learn.singleton;

public class Test_two {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                PrintCurrentThreadName printer = new PrintCurrentThreadName();
                printer.printCurrentThreadName();
            }
        };

        Thread thread = new Thread(runnable, "嘻嘻");
        thread.start();

//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName());
//
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread("haha");
//
//        myThread1.start();
//        myThread2.start();

    }
}
