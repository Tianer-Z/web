package Thread_learn.copier_model;

public class Employee extends Thread{
    private int workTimes;
    private Copier copier;

    public Employee(String name, int workTimes, Copier copier) {
        super(name);
        this.workTimes = workTimes;
        this.copier = copier;
    }

    public void run() {
        System.out.println(this.getName() + "开始工作");
        for (int i = 0; i < this.workTimes; i++) {
            int pageAmount = (int) (Math.random() * 5) + 1;
            System.out.println(this.getName() + "尝试调用 " + this.copier.getName() + "的copyPages方法");
            this.copier.copyPages(pageAmount);
        }
        System.out.println(this.getName() + "完成工作下班");
    }
}