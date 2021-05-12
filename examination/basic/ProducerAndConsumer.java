package examination.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyContainer {

    private Queue<Integer> queue = new LinkedList<>();;
    private final int MAX_SIZE;
    private Lock lock = new ReentrantLock();
    private Condition producer = lock.newCondition();
    private Condition consumer = lock.newCondition();

    MyContainer(int max_size) {
        this.MAX_SIZE = max_size;
    }

    public void put(Integer x) {
        try {
            lock.lock();
            while (queue.size() == MAX_SIZE) {
                producer.await();
            }
            queue.offer(x);
            consumer.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public Integer get() {
        int x = 0;
        try {
            lock.lock();
            while (queue.size() == 0) {
                consumer.await();
            }
            x = queue.poll();
            producer.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
        return x;
    }

    public int getCount() {
        return queue.size();
    }

}


public class ProducerAndConsumer {
    private static int count = 1;
    public static void main(String[] args) {
        MyContainer myContainer = new MyContainer(2);
        for (int i = 1; i<= 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 10; j++) {
                        myContainer.put(count++);
                    }
                }
            }, "producer" + i).start();
        }

        for (int i = 1; i<= 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(myContainer.get());
                    }
                }
            }, "consumer").start();
        }
    }
}
