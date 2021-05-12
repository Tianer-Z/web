package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

class Foo {
    AtomicBoolean flagA = new AtomicBoolean(false);
    AtomicBoolean flagB = new AtomicBoolean(false);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flagA.set(true);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!flagA.get()) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flagB.set(true);
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!flagB.get()) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        new Thread(() -> {
            try {
                foo.third(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("C");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(100);
        new Thread(() -> {
            try {
                foo.second(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("B");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(100);
        new Thread(() -> {
            try {
                foo.first(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("A");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();



    }

}