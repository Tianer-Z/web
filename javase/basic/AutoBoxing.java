package javase.basic;

import java.io.UnsupportedEncodingException;

public class AutoBoxing {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Integer x = Integer.valueOf(1);
        Integer y = Integer.valueOf(1);
        System.out.println(x == y);

        String str = new String("百度");
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(bytes.length);
        String str2 = new String(bytes, "UTF-16");

        byte[] bytes2 = str2.getBytes("UTF-16");
        System.out.println(bytes2.length);

        System.out.println("===================================");

        String s1 = new String("1");
        s1.intern();
        String s2 = "1";
        System.out.println(s1 == s2);

        String s3 = new String("12") + new String("1");
        s3.intern();
        String s4 = "121";
        System.out.println(s3 == s4);


    }
}
