package javase.interface_learn.interface_two;

public class TransportStatusForLog {
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public TransportStatusForLog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
