package examination.pattern.singleton;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/23
 */
public class EnumSingleton {
    public static EnumSingleton getInstance() {
        return EnumClass.INSTANCE.instance;
    }

    private enum EnumClass {
        /**
         * 枚举单例
         */
        INSTANCE;
        private EnumSingleton instance;
        EnumClass() {
            instance = new EnumSingleton();
        }
    }

}
