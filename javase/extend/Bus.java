package javase.extend;

public class Bus extends CarBase {
    public int max_Passenger = 35;
    public int current_Passenger = 0;

    public Bus() {
        System.out.println("Bus 类的构造方法被调用了!");
    }

    public Bus(int speed, String name, String color, int maxSpeed) {
        super(speed, name, color, maxSpeed);
        System.out.println("Bus 类有参数的构造方法被调用了!");
    }
}
