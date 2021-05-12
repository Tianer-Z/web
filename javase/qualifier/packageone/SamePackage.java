package javase.qualifier.packageone;

public class SamePackage extends Father{
    public void publicMethond() {
        System.out.println("SamePackage publicMethond");
    }

    protected void protectedMethond() {
        System.out.println("SamePackage protectedMethond");
    }

    void defaultMethond() {
        System.out.println("SamePackage defaultMethond");
    }

    private void privatedMethond() {
        System.out.println("SamePackage privateMethond");
    }

    public static void main(String[] args) {
       SamePackage samePackage = new SamePackage();
       samePackage.test();
    }
}
