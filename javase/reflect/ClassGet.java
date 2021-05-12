package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassGet {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("javase.reflect.User");

        System.out.println(c1);
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getClassLoader());

        System.out.println("=========================");
//        Field[] fields = class1.getFields();
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field field = c1.getDeclaredField("name");
        System.out.println(field);

        System.out.println("=======================");
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println(c1.getMethod("setId", int.class));

        System.out.println("========================");
        Method[] methods1 = c1.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }

        System.out.println("=========================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor[] constructors1 = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println("#" + constructor);
        }
        System.out.println(c1.getConstructor());
        System.out.println(c1.getConstructor(String.class, int.class, int.class));

    }

}

