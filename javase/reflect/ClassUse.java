package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassUse {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("javase.reflect.User");
        Constructor constructor = c1.getConstructor(String.class, int.class, int.class);
        User user = (User) constructor.newInstance("aa", 1, 2);
        System.out.println(user);

//        Object object = constructor.newInstance("aa", 1, 2);
//        System.out.println(object.getClass());

        Method method = c1.getDeclaredMethod("setName");

        method.setAccessible(true);
        Object bb = method.invoke(null,null);
        System.out.println(bb);
        System.out.println(user);

        User user1 = (User) c1.newInstance();
        System.out.println(user1);

        Field field = c1.getDeclaredField("name");

        field.setAccessible(true);
        field.set(user1, "hah");
        System.out.println(user1);
    }
}
