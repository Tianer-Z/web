package concurrency.JMM;

public class VotileStudy {
    private static volatile boolean shutdown = false;

    static class CoffeeMaker{
        public static void shutdown() {
            shutdown = true;
            System.out.println("关闭了咖啡机");
        }

        public static void makeCoffee() {
            System.out.println("开始制作");
            while (!shutdown);
            System.out.println("停止工作");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //开始制作咖啡
        new Thread(() -> {
            CoffeeMaker.makeCoffee();
        }).start();
        Thread.sleep(100);
        new Thread(() -> {
            CoffeeMaker.shutdown();
        }).start();
    }


}
