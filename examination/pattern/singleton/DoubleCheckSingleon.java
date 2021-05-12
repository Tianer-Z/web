package examination.pattern.singleton;

public class DoubleCheckSingleon {
    private static volatile DoubleCheckSingleon instance;

    private DoubleCheckSingleon() {
    }

    public static DoubleCheckSingleon getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleon.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleon();
                }
            }
        }
        return instance;
    }
}
