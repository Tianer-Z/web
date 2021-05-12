package examination.basic;


import java.io.File;
import java.io.UncheckedIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

class ReflectTest {
    private int private_field;
    public int public_field;

    public void fun(int x) {
        System.out.println(x);
    }
    public ReflectTest(){}
    public ReflectTest(int private_field) {
        this.private_field = private_field;
    }
}


public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class a1 = Class.forName("examination.basic.ReflectTest");
        Constructor xx = a1.getDeclaredConstructor(int.class);


        ReflectTest reflectTest = (ReflectTest) xx.newInstance(1);
        Field private_field = a1.getDeclaredField("private_field");
        Field public_field = a1.getDeclaredField("public_field");

        int temp = (int) public_field.get(reflectTest);
        System.out.println(temp);
        public_field.set(reflectTest, 11);
        temp = (int) public_field.get(reflectTest);
        System.out.println(temp);

        private_field.setAccessible(true);
        temp = (int) private_field.get(reflectTest);
        System.out.println(temp);
        private_field.set(reflectTest, 22);
        temp = (int) private_field.get(reflectTest);
        System.out.println(temp);

        Method fun = a1.getDeclaredMethod("fun", int.class);
        fun.invoke(xx.newInstance(1), 5);

        Constructor constructor = a1.getConstructor();
        constructor.newInstance();
    }

    /*
    反射机制介绍

JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
静态编译和动态编译

•静态编译：在编译时确定类型，绑定对象

•动态编译：运行时确定类型，绑定对象
反射机制优缺点

•优点： 运行期类型的判断，动态加载类，提高代码灵活度。

•缺点： 性能瓶颈：反射相当于一系列解释操作，通知 JVM 要做的事情，性能比直接的java代码要慢很多。
反射的应用场景

反射是框架设计的灵魂。

在我们平时的项目开发过程中，基本上很少会直接使用到反射机制，但这不能说明反射机制没有用，实际上有很多设计、开发都与反射机制有关，例如模块化的开发，通过反射去调用对应的字节码；动态代理设计模式也采用了反射机制，还有我们日常使用的 Spring／Hibernate 等框架也大量使用到了反射机制。

举例：

①我们在使用JDBC连接数据库时使用Class.forName()通过反射加载数据库的驱动程序；

②Spring框架也用到很多反射机制，最经典的就是xml的配置模式。Spring 通过 XML 配置模式装载 Bean 的过程：

1) 将程序内所有 XML 或 Properties 配置文件加载入内存中;

2)Java类里面解析xml或properties里面的内容，得到对应实体类的字节码字符串以及相关的属性信息;

3)使用反射机制，根据这个字符串获得某个类的Class实例;

4)动态配置实例的属性
    * */
}
