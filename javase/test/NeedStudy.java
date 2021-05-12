package javase.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NeedStudy {

    public static final Object object = new Object();

    public static void main(String[] args) {


        System.out.println("====================");
        System.out.println("字符串转整数");
        System.out.println(Integer.valueOf("123"));


        System.out.println("====================");
        System.out.println("Arrays.asList()");
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);


        System.out.println("====================");
        System.out.println("Set<int[]>");
        Set<int[]> set = new HashSet<>();
        set.add(new int[]{1, 2});
        set.add(new int[]{1, 2});
        System.out.println(set.size());


        System.out.println("====================");
        System.out.println("String.subString()");
        String str = "0123456";
        String ans = null;
        ans = str.substring(2, 5);
        System.out.println(ans);


        System.out.println("====================");
        System.out.println("String.trim()");
        str = "  a  b  c ";
        String[] strs = str.trim().split(" ");



        System.out.println("====================");
        System.out.println("线程-终止状态 " + Thread.State.TERMINATED);


        System.out.println("====================");
        System.out.println("activeCount= " + Thread.activeCount());
        Thread.currentThread().getThreadGroup().list();

        System.out.println("====================");

    }
}
