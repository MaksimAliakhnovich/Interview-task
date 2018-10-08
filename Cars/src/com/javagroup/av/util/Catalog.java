package com.javagroup.av.util;

import com.javagroup.av.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<Car> getCars() {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Land Rover", "Freelander", 2001, "бензин 2.5 л", "серый", 40200, true));
        cars.add(new Car("Infiniti FX", "FX Renegade", 2009, "бензин 3.5 л", "белый", 16439, false));
        cars.add(new Car("Honda", "Civic", 2009, "бензин 1.3 л", "жёлтый", 14032, true));
        cars.add(new Car("Opel", "Astra H", 2007, "дизель 2.9 л", "синий", 15036, true));
        cars.add(new Car("Audi", "A6 Allroad", 2003, "бензин 2.7 л", "красный", 14435, true));
        cars.add(new Car("MINI", "Cooper", 2007, "бензин 1.6 л", "серый", 49118, false));
        cars.add(new Car("Volvo", "XC60", 2014, "бензин 3.5 л", "чёрный", 52120, true));
        cars.add(new Car("Audi", "80 B4", 1993, "дизель 1.7 л", "чёрный", 6800, false));
        cars.add(new Car("Audi", "A6 (C5) AFT", 1998, "дизель 1.5 л", "серый", 7718, false));
        cars.add(new Car("Mercedes-Benz", "ML-Klasse AMG", 2005, "бензин 2.5 л", "серый", 21451, true));
        cars.add(new Car("УАЗ", "Hunter Diesel", 2012, "дизель 2.5 л", "коричневый", 12027, true));
        cars.add(new Car("Mercedes-Benz", "S-Klasse (W221) 221L 4Matic", 2007, "бензин 2.5 л", "серый", 31074, true));
        cars.add(new Car("Peugeot", "207", 2009, "бензин 1.6 л", "синий", 9924, false));
        cars.add(new Car("Mazda", "MPV", 2000, "бензин 2.5 л", "красный", 5714, true));
        cars.add(new Car("Hyundai", "Sonata", 2006, "газ 1.4 л", "белый", 12831, true));
        cars.add(new Car("BMW", "7-reihe (E66) V12 Long", 2004, "электро", "белый", 16036, true));
        cars.add(new Car("BMW", "7-reihe (F01) 730d", 2009, "бензин 2.2 л", "чёный", 44306, false));
        cars.add(new Car("Lada", "Kalina", 2008, "дизель 1.8 л", "серебристый", 6175, true));

        return cars;
    }

    public void setCar(List<Car> cars, Car car) {
        cars.add(car);
    }
}
