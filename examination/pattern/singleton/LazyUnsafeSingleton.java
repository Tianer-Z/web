package examination.pattern.singleton;

public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance;

    private LazyUnsafeSingleton() {}

    public static LazyUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }

}
