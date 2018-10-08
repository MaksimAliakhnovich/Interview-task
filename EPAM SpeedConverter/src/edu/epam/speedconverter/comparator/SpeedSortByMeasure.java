package edu.epam.speedconverter.comparator;

import edu.epam.speedconverter.model.Speed;

import java.util.Comparator;

/**
 * этот класс должен быть унаследован от интерфейса Компаратор
 * и должен сравнивать типы скоростей
 */
public class SpeedSortByMeasure implements Comparator<Speed> {

    @Override
    public int compare(Speed speed1, Speed speed2) {

        int s1 = getPosition(speed1.getMeasure());
        int s2 = getPosition(speed2.getMeasure());
        return s1 - s2;
    }

    private int getPosition(String measure) {

        if (measure.equals("kmh")) {
            return 1;
        } else if (measure.equals("mph")) {
            return 2;
        } else if (measure.equals("kn")) {
            return 3;
        } else {
            return 4;
        }
    }
}
