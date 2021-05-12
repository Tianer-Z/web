package javase.qualifier.packageone;

public class Father {
    public void publicMethond() {
        System.out.println("Father publicMethond");
    }

    protected void protectedMethond() {
        System.out.println("Father protectedMethond");
    }

    void defaultMethond() {
        System.out.println("Father defaultMethond");
    }

    private void privatedMethond() {
        System.out.println("Father privateMethond");
    }

    public void test()
    {
        this.publicMethond();
        this.protectedMethond();
        this.defaultMethond();
        this.privatedMethond();

    }

}
