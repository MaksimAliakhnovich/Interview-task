package com.javagroup.av.comparators;

import com.javagroup.av.model.Car;
import java.util.Comparator;

public class CarSortByBrand implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getBrand().compareTo(car2.getBrand());
    }
}
