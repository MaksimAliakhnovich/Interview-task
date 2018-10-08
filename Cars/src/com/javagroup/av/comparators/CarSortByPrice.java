package com.javagroup.av.comparators;

import com.javagroup.av.model.Car;
import java.util.Comparator;

public class CarSortByPrice implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {

        double priceCar1 = car1.getPrice();
        double priceCar2 = car2.getPrice();

        if (priceCar1 < priceCar2) {
            return -1;
        } else if (priceCar1 > priceCar2) {
            return 1;
        } else {
            return 0;
        }
    }
}
