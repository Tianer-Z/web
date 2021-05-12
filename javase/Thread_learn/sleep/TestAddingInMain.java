package Thread_learn.sleep;

public class TestAddingInMain {
    public void addTest()
    {
        int a = (int) (100 * Math.random());
        int b = (int) (100 * Math.random());
        System.out.println("请在5s中内给出答案");

        System.out.println("当前线程的名称: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("程序出错，出错信息为：" + e.getMessage());
        }

        System.out.println("答案是: " + (a + b));
    }
}
