package javase.reflect;

public class ClassLoderTest {
    public static void main(String[] args) throws ClassNotFoundException {

        //系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        //引导类加载器
        ClassLoader grandfather = parent.getParent();
        System.out.println(grandfather);

        //当前类加载器
        ClassLoader classLoader1 = Class.forName("javase.reflect.ClassLoderTest").getClassLoader();
        System.out.println(classLoader1);

        classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        System.out.println(System.getProperty("java.class.path"));

        /*
        C:\Program Files\Java\jdk\jre\lib\charsets.jar;
        C:\Program Files\Java\jdk\jre\lib\deploy.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\access-bridge-64.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\cldrdata.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\dnsns.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\jaccess.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\jfxrt.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\localedata.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\nashorn.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\sunec.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\sunjce_provider.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\sunmscapi.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\sunpkcs11.jar;
        C:\Program Files\Java\jdk\jre\lib\ext\zipfs.jar;
        C:\Program Files\Java\jdk\jre\lib\javaws.jar;
        C:\Program Files\Java\jdk\jre\lib\jce.jar;
        C:\Program Files\Java\jdk\jre\lib\jfr.jar;
        C:\Program Files\Java\jdk\jre\lib\jfxswt.jar;
        C:\Program Files\Java\jdk\jre\lib\jsse.jar;
        C:\Program Files\Java\jdk\jre\lib\management-agent.jar;
        C:\Program Files\Java\jdk\jre\lib\plugin.jar;
        C:\Program Files\Java\jdk\jre\lib\resources.jar;
        C:\Program Files\Java\jdk\jre\lib\rt.jar;F:\Java\study\out\production\study;
        F:\IDEA\IntelliJ IDEA 2020.2.3\lib\idea_rt.jar
         */
    }

}
