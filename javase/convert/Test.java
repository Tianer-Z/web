package convert;

import convert.Car;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[1] = new Car();
        Car[] cloneCars = cars.clone();
        
        cars[1].value = 777;
        cloneCars[1].value = 999;

        System.out.println(cars[1].value);
        System.out.println(cloneCars[1].value);
        //

        cloneCars[1] = new Car();
        cars[1].value = 777;
        cloneCars[1].value = 999;

        System.out.println(cars[1].value);
        System.out.println(cloneCars[1].value);
    }
}
