package concurrency;

public class SynchronizedStaticAndMember {
    public static int staticp;
    private int memberb;

    public synchronized static void staticA() {
        System.out.println("staticA");
    }
    public synchronized static void staticB() {
        System.out.println("staticB");
    }

    public void memberA() {
        System.out.println("memberA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void memberB() {
        System.out.println("memberB");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SynchronizedStaticAndMember aa = new SynchronizedStaticAndMember();
        SynchronizedStaticAndMember bb = new SynchronizedStaticAndMember();
        aa.memberA();
        bb.memberA();
    }

}
