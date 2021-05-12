package Thread_learn.copier_model;

public class Copier {
    private String name;

    public Copier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void copyPages(int pages) {
        Thread employee = Thread.currentThread();
        System.out.println(employee.getName() + "\t正在使用打印机\t" + this.name);
        try {
            employee.sleep(pages * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(employee.getName() + "\t使用完打印机\t" + this.name);
    }

}