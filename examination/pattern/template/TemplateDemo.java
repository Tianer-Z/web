package examination.pattern.template;

abstract class Game
{
    abstract void start();
    abstract void end();

    final public void playGame() {
        start();
        end();
    }
}

class Football extends Game {

    @Override
    void start() {
        System.out.println("Football start");
    }

    @Override
    void end() {
        System.out.println("Football end");
    }
}

class Basketball extends Game {

    @Override
    void start() {
        System.out.println("Basketball start");
    }

    @Override
    void end() {
        System.out.println("Basketball end");
    }
}



public class TemplateDemo {
    public static void main(String[] args) {
        Football football = new Football();
        football.playGame();

        Basketball basketball = new Basketball();
        basketball.playGame();

    }
}
