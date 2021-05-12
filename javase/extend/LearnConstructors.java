package javase.extend;

public class LearnConstructors {
    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        SportsCar converted = (SportsCar) carBase;

        System.out.println(carBase);
        System.out.println(sportsCar);
        System.out.println(converted);

        carBase.speedUp(77);
        System.out.println("carBase.speed 的值为" + carBase.speed);
        System.out.println("sportsCar.speed 的值为" + sportsCar.speed);
        System.out.println("converted.speed 的值为" + converted.speed);

        sportsCar.speedUpUsingN(77);
        System.out.println("carBase.speed 的值为" + carBase.speed);
        System.out.println("sportsCar.speed 的值为" + sportsCar.speed);
        System.out.println("converted.speed 的值为" + converted.speed);

        converted.speedUpUsingN(99);
        System.out.println("carBase.speed 的值为" + carBase.speed);
        System.out.println("sportsCar.speed 的值为" + sportsCar.speed);
        System.out.println("converted.speed 的值为" + converted.speed);

//        Object objCar = converted;
//        CarBase carBase1 = (CarBase)objCar;
//
//        System.out.println(objCar);
//        System.out.println(carBase1);

    }
}