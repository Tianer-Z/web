package Thread_learn.bank;



public class GetMoney implements Runnable{
    private BankAccount bankAccount;
    private int cash;

    public GetMoney(BankAccount bankAccount, int cash) {
        this.bankAccount = bankAccount;
        this.cash = cash;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("线程\"" + thread.getName() + "\"正在取钱");
        bankAccount.getMoneyOutOfBank(cash);
        System.out.println("线程\"" + thread.getName() + "\"取钱完毕");

    }

}

//public class GetMoney extends Thread{
//    private BankAccount bankAccount;
//    private int cash;
//
//    public GetMoney(BankAccount bankAccount, int cash) {
//        this.bankAccount = bankAccount;
//        this.cash = cash;
//    }
//
//    @Override
//    public void run() {
//        Thread thread = Thread.currentThread();
//        System.out.println("线程\"" + thread.getName() + "\"正在取钱");
//        bankAccount.getMoneyOutOfBank(cash);
//        System.out.println("线程\"" + thread.getName() + "\"取钱完毕");
//
//    }
//
//}