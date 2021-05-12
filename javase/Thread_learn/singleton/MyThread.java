package Thread_learn.singleton;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
        super();
    }

    public void run(){

//        Thread currentTread = Thread.currentThread();
//        System.out.println(1111 + currentTread.getName());
        System.out.println("线程 名字" + this.getName());
    }


}
