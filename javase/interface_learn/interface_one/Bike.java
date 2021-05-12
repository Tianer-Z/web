package javase.interface_learn.interface_one;

public class Bike {
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Bike(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public CarStatus getCarStatus() {
        CarStatus carStatus = new CarStatus(name, speed);
        return  carStatus;
    }
}
