package javase.extend;

public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;

    public CarBase() {
        System.out.println("CarBasee 类的构造方法被调用了!");
    }

    public CarBase(int speed, String name, String color, int maxSpeed) {
        this.speed = speed;
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("CarBasee 类有参数的构造方法被调用了!");
    }

    public void speedUp(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0) tempSpeed = this.speed + p_speed;
        if (tempSpeed <= this.maxSpeed) this.speed = tempSpeed;
    }

    public void slowDown(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0) tempSpeed = this.speed - p_speed;
        if (tempSpeed >= 0) this.speed = tempSpeed;
    }
}
