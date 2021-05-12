package javase.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassEfficiency {
    static void test01() {
        User user = new User();
        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getId();
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次 " + (endTime - startTime) + " ms");
    }

    static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method method = c1.getMethod("getId", null);

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            method.invoke(user, null);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("反射方法执行10亿次 " + (endTime - startTime) + " ms");
    }

    static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method method = c1.getMethod("getId", null);
        method.setAccessible(true);
        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            method.invoke(user, null);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("反射方法执行10亿次,关闭检测 " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }

}
