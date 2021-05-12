package concurrency;

public class ThreadState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0 ; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----thread线程结束----");
        });

        //新生状态
        Thread.State state = thread.getState();
        System.out.println("线程状态 " + state);

        //就绪状态
        thread.start();
        state = thread.getState();
        System.out.println("线程状态" + state);

        //线程状态
        while (state != Thread.State.TERMINATED) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println("线程状态 " + state);
        }



//        //线程数目
//        while(true) {
//            int thread_count = Thread.activeCount();
//            System.out.println("当前线程数量 " + thread_count);
//            if (thread_count == 2) {
//                break;
//            }
//
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            state = thread.getState();
//            System.out.println("线程状态 " + state);
//        }
    }

}
