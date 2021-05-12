package january;

import java.util.concurrent.TimeUnit;

public class InterruptedDemo {
    public static void main(String[] args) {
//       Thread thread = new Thread() {
//            @Override
//            public void run() {
//                System.out.println(111);
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//
//       thread.start();
//
//        Thread thread1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(222);
//        });
//        thread1.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("33");
//            }
//        }).start();




//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (long i = 0; i < Long.MAX_VALUE; i++) {
//                    if (!interrupted()) {
//                        break;
//                    }
//                }
//                System.out.println("haha");
//            }
//        };
//
//        thread.start();
//        thread.interrupt();


        Object obj = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();

                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().isInterrupted());
                        System.out.println("傻狗");
                    }
                }
            }
        };

//        thread.start();
//        thread.interrupt();


//        Thread thread1 = new Thread() {
//            @Override
//            public void run() {
//                while(!Thread.interrupted()){
//                    try{
//                        Thread.sleep(1);
//                        //接收到中断信号，捕获异常并清除中断状态，所以不退出,所以这种不是良好的设计方式,如果想要退出,需要在catch语句中Thread.currentThread().interrupt();
//                    }catch(Exception e){
//                        System.out.println("Interrupte and clear interrupt status, so run continue");
//                    }
//                }
//                System.out.println("exit normal 3");
//            }
//        };
//
//        thread1.start();
//
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread1.interrupt();

        Thread thread1 = new Thread(() -> {
           synchronized (obj) {
               System.out.println("Thread1 start");
               try {
                   System.out.println("Thread1 wait");
                   obj.wait();
                   System.out.println("Thread1 wait_ending");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
            System.out.println("Thread1 end");

        });

        Thread thread2 = new Thread(() -> {
            synchronized (obj) {
                System.out.println("Thread2 start");
                try {
                    System.out.println("Thread2 sleep");
                    Thread.sleep(1000);
                    System.out.println("Thread2 sleep_ending");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread2 end");

        });

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();
    }
}
