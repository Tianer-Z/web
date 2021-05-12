package examination.pattern.singleton;

public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton() {}
    public static HungerSingleton getInstance() {
        return instance;
    }
}
