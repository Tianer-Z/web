package Thread_learn.singleton;

public class PrintCurrentThreadName {
    void printCurrentThreadName(){
        Thread thread = Thread.currentThread();
        System.out.println("当前线程名称： " + thread.getName());
    }
}
