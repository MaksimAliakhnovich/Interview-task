package edu.epam.speedconverter.comparator;

import edu.epam.speedconverter.model.Speed;

import java.util.Comparator;

/**
 * этот класс должен быть унаследован от интерфейса Компаратор
 * и должен сравнивать скорости выраженные в m/s
 */
public class SpeedSortByValueMs implements Comparator<Speed> {

    @Override
    public int compare(Speed speed1, Speed speed2) {

        return Double.compare(
                Double.parseDouble(speed1.getValueMs()),
                Double.parseDouble(speed2.getValueMs())
        );
    }
}
