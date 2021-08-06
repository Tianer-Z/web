package test;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/23
 */
public class Singleton {

    private static volatile Singleton instance= null;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}



