package javase.interface_learn.interface_two;

public class Bike implements RecordeAble{
    private String name;
    private int speed;

    public Bike(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public TransportStatusForLog getTransportStatus() {
        TransportStatusForLog status = new TransportStatusForLog(name, speed);
        return status;
    }
}
