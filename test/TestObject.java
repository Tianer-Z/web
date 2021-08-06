package test;

import java.util.*;
import java.util.concurrent.*;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/21
 */

class Car {
    int x;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return x == car.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

}

public class TestObject {

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.hashCode());
    }
}
