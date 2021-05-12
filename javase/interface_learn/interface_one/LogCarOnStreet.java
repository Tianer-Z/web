package javase.interface_learn.interface_one;

public class LogCarOnStreet {
    public static void main(String[] args) {
        CarBase car = null;
        car = new CarBase("carA", "blue", 10);
        CarRecorder.recordCar(car);

        car = new CarBase("carB", "red", 20);
        CarRecorder.recordCar(car);

        car = new CarBase("carC", "black", 30);
        CarRecorder.recordCar(car);

        Bike bikeA = new Bike("bikeA", 12);
        CarRecorder.recordCar(bikeA);

        Bike bikeB = new Bike("bikeB", 22);
        CarRecorder.recordCar(bikeB);
    }
}
