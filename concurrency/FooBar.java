package concurrency;

class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            notify();
            wait();

        }
        notifyAll();
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            notify();
            wait();
        }
        notifyAll();

    }

    public static void main(String[] args) {
        FooBar fooBar = new FooBar(2);
        new Thread(() -> {
            try {
                fooBar.foo(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("foo");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fooBar.bar(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Bar");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

}
