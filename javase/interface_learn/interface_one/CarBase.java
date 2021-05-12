package javase.interface_learn.interface_one;

public class CarBase {
    protected String name;
    protected String color;
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public CarBase(String name, String color, int speed) {
        this.speed = speed;
        this.name = name;
        this.color = color;
    }

    public void speedUp(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0){
            tempSpeed = this.speed + p_speed;
        }
    }

    public void slowDown(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0){
            tempSpeed = this.speed - p_speed;
        }
        if(tempSpeed >= 0){
            this.speed = tempSpeed;
        }
    }

    public CarStatus getCarStatus() {
        CarStatus carStatus = new CarStatus(this.name, this.speed);
        return carStatus;
    }

}
