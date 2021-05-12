package examination.pattern.singleton;

public class LazySafeSingleton {
    private static LazySafeSingleton instance;
    private LazySafeSingleton() {}
    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
