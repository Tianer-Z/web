package examination.basic;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWrite {
    private ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = rwlock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = rwlock.writeLock();

    public void read() {
        try {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " 已进入");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 已退出");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }

    public void write() {
        try {
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + " 已进入");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 已退出");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

}


public class ReentReadWriteLockDemo {
    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite();
        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.read();
            }
        }, "read1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.read();
            }
        }, "read2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.read();
            }
        }, "read3").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.write();
            }
        }, "write1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.write();
            }
        }, "write2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWrite.write();
            }
        }, "write3").start();

    }
}
