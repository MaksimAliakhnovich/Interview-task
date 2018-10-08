package edu.epam.speedconverter.comparator;

import edu.epam.speedconverter.model.Speed;

import java.util.Comparator;

/**
 * этот класс должен быть унаследован от интерфейса Компаратор
 * и должен сравнивать значения скоростей
 */
public class SpeedSortByValue implements Comparator<Speed> {

    @Override
    public int compare(Speed speed1, Speed speed2) {
        return speed1.getValue() - speed2.getValue();
    }
}
