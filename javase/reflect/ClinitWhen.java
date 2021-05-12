package javase.reflect;

public class ClinitWhen {
    static {
        System.out.println("Main类初始化"); //Main方法初始化
    }


    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 主动初始化
         */

        //Son son = new Son(); // new一个对象初始化 // 父类初始化
        //System.out.println(Son.sa); // 访问静态变量或方法
        //Son.fun();//访问静态方法
//        Class.forName("javaee.reflect.Son"); //反射

        /**
         *被动初始化
         */
//        System.out.println(Son.fb); //真正声明静态域的类
//        System.out.println(Son.sf);//静态常量
        Son[] sons = new Son[10];//数组引用
    }
}

class Father {
    static int fb = 2;

    static {
        System.out.println("父类初始化");
    }
}

class Son extends Father {
    static {
        System.out.println("子类初始化");
        sa = 300;
    }

    static int sa = 100;

    static final int sf = 66;

    static void fun() {
        System.out.println("Son静态方法");
    }
}