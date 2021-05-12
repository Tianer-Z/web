package javase.interface_learn.interface_one;

public class CarRecorder {
    public static int counter = 0;
    public static void recordCar(Object transportObj) {
        if (transportObj == null) {
            return ;
        } else {
            counter++;
            CarStatus carStatus = null;

            if (transportObj instanceof CarBase) {
                CarBase carBase = (CarBase) transportObj;
                carStatus = carBase.getCarStatus();
            } else if (transportObj instanceof Bike) {
                Bike bike = (Bike) transportObj;
                carStatus = bike.getCarStatus();
            } else {
                return ;
            }

            System.out.println("这是第" + counter + "辆的车");
            System.out.println("车位" + carStatus.getName() + "速度为" + carStatus.getSpeed());
        }
    }

}
