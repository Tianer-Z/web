package Thread_learn.bank;

public class BankAccount {
    private int money = 0;

    public synchronized void getMoneyOutOfBank(int cash) {
        if (cash <= 0) {
            System.out.println("取现金额必须大于0");
            return ;
        }
        if (money < cash) {
            System.out.println("现金不足");
            return ;
        }

        System.out.println("正在取钱处理，请稍后......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return ;
        }

        money -= cash;
        System.out.println("取钱成功" + cash + "元，剩余金额" + money + "元");
    }

    public void pushMoneyToBank(int cash) {
        if (cash <= 0) {
            System.out.println("存钱金额必须大于0");
        }

        System.out.println("正在存钱处理，请稍后......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return ;
        }

        money += cash;
        System.out.println("存钱成功" + cash + "元，剩余金额" + money + "元");
    }

}
