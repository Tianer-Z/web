package examination.basic;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    int task = 1;

    public Producer(BlockingQueue queue) {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                blockingQueue.put(task++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    private BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int x = blockingQueue.take();
                System.out.println(x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class ArrayBlockingQueueDemo {
    public static final int MAX_SIZE = 10;
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(MAX_SIZE);
        new Thread(new Producer(blockingQueue)).start();
        new Thread(new Consumer(blockingQueue)).start();
    }
}
