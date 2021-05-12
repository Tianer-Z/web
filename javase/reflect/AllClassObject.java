package javase.reflect;

import java.lang.annotation.ElementType;

//所有类型的Class对象
public class AllClassObject {
    public static void main(String[] args) {
        Class c1 = Object.class; //类
        Class c2 = Comparable.class;//接口
        Class c3 = int[].class;//数组
        Class c4 = ElementType.class;//枚举
        Class c5 = Override.class;//注解
        Class c6 = Integer.class;//基本数据类型
        Class c7 = void.class;//void

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);


        Class c8 = int[].class;
        Class c9 = int[][].class;
        Class c10 = double[].class;

        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);

        System.out.println(c8.hashCode());
        System.out.println(c9.hashCode());
        System.out.println(c10.hashCode());



        //只要元素类型与维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
