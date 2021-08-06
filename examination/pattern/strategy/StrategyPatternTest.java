package examination.pattern.strategy;

/**
 * @Author: Zhangsl
 * @Date: 2021/08/06
 */

interface StrategyInterface {
    int doOperation(int x, int y);
}

class AddStrategy implements StrategyInterface {

    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}

class SubStrategy implements StrategyInterface {

    @Override
    public int doOperation(int x, int y) {
        return x - y;
    }
}

class Context {

    private StrategyInterface strategy;

    public Context(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int x, int y) {
        return strategy.doOperation(x, y);
    }

}


public class StrategyPatternTest {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;

        Context context = new Context(new AddStrategy());
        int res = context.doOperation(x, y);
        System.out.println(res);

        context = new Context(new SubStrategy());
        res = context.doOperation(x, y);
        System.out.println(res);

    }
}
