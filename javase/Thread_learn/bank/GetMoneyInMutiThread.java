package Thread_learn.bank;

public class GetMoneyInMutiThread {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.pushMoneyToBank(100);

        GetMoney money1 = new GetMoney(bankAccount, 100);
        GetMoney money2 = new GetMoney(bankAccount, 100);
        GetMoney money3 = new GetMoney(bankAccount, 100);

        Thread thread1 = new Thread(money1, "线程1");
        Thread thread2 = new Thread(money2, "线程2");
        Thread thread3 = new Thread(money3, "线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

//public class GetMoneyInMutiThread {
//    public static void main(String[] args) throws InterruptedException {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.pushMoneyToBank(100);
//
//        GetMoney money1 = new GetMoney(bankAccount, 100);
//        GetMoney money2 = new GetMoney(bankAccount, 100);
//        GetMoney money3 = new GetMoney(bankAccount, 100);
//
//        thread1.setName("线程1");
//        thread2.setName("线程2");
//        thread3.setName("线程3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//
//}