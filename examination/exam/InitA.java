package examination.exam;

public class InitA {
    private static InitA singleTon = new InitA();
    public static int count1;
//    private static InitA singleTon = new InitA();
    public static int count2 = 0;
//    private static InitA singleTon = new InitA();

    private InitA() {
        count1++;
        count2++;
    }

    public static InitA getInstance() {
        return singleTon;
    }


    public static void main(String[] args) {
        InitA singleTon = InitA.getInstance();
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);
    }
}
