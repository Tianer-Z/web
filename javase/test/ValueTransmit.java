package javase.test;

public class ValueTransmit {

    public static void noUse(String str){
        str = "0" + str;
    }
    public static void noUse1(int p_x){
        p_x = 1 + p_x;
    }
    public static void doSwap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 1;
        noUse1(a);
        System.out.println(a);

        String str = "OOPS";
        noUse(str);
        System.out.println(str);

        Integer i = 10;
        Integer j = 5;
        doSwap(i, j);
    }
}
    