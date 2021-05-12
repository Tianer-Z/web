package examination.juc;

public class TwoThreadAB {
    private static boolean flag = true;
    private static Object obj = new Object();

    public static void main(String args[ ]) {

        Thread tA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (!flag) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("A");
                            flag = !flag;
                            obj.notifyAll();
                        }
                    }
                }

            }
        });

        Thread tB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (flag) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("B");
                            flag = !flag;
                            obj.notifyAll();
                        }
                    }
                }
            }
        });


        tA.start();
        tB.start();


    }

}

