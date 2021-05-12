package javase.basic;

public class Cache {
    public static void main(String[] args) {
        Integer x = 1;
        int y = 1;
        System.out.println(x.equals(y));

        System.out.println("====================");
        Integer num1 = 100;
        //        Long num1 = 100L;
        int num2 = 100;
        Long num3 = 200L;

        long xxx = 200L;
        System.out.println(num3.equals(xxx));

        System.out.println(num1 + num2);  //200
        System.out.println(num3 == (num1 + num2));  //true
        System.out.println(num3.equals(num1 + num2));  //false
        System.out.println("====================");


        Integer a = Integer.valueOf(123);
        Integer b = Integer.valueOf(123);
        Integer c = new Integer(123);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println(a == b);
        System.out.println(a == (c + 0));
    }

}
