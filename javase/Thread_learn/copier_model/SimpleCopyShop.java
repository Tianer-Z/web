package Thread_learn.copier_model;

public class SimpleCopyShop {
    public static void main(String[] args) {
        Copier copierA = new Copier("CopierA");
        Copier copierB = new Copier("CopierB");
        Employee employeeA = new Employee("employeeA", 1, copierA);
        Employee employeeB = new Employee("employeeB", 1, copierA);

        employeeA.start();
        employeeB.start();
    }
}
