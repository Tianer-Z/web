package examination.pattern.factory;


/**
 * @Author: Zhangsl
 * @Date: 2021/08/06
 */

interface Ball {
    void createBall();
}

class Football implements Ball {

    @Override
    public void createBall() {
        System.out.println("生产 足球");
    }
}

class Basketball implements Ball {

    @Override
    public void createBall() {
        System.out.println("生产 篮球");
    }
}

class BallFactory {

    public Ball createBall(String type) {
        if ("足球".equals(type)) {
            return new Football();
        } else if ("篮球".equals(type)) {
            return new Basketball();
        }
        return null;
    }

}


public class FactoryTest {

    public static void main(String[] args) {
        BallFactory factory = new BallFactory();
        Ball ball = factory.createBall("足球");
        ball.createBall();

        ball = factory.createBall("篮球");
        ball.createBall();

    }

}
