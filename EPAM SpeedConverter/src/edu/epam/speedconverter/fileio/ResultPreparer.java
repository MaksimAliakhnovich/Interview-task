package edu.epam.speedconverter.fileio;

import edu.epam.speedconverter.comparator.SpeedSortByMeasure;
import edu.epam.speedconverter.comparator.SpeedSortByValue;
import edu.epam.speedconverter.comparator.SpeedSortByValueMs;
import edu.epam.speedconverter.model.Speed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultPreparer {

    /**
     * метод получает заполненную коллекцию List<Speed>
     * создает две коллекции List<Speed> т.е. speeds1 и speeds2
     * а так же коллекцию List<String> list в которую мы будем записывать результаты
     * сортировки
     * 1. speeds1 отсортировать по условию
     * записать эту коллекцию в виде строк в list
     * 2. speeds1 отсортировать по условию второй раз
     * записать эту коллекцию в виде строк в list
     * 3. записать в list коллекцию speeds2 (без сортировки и с m/s)
     * 4. вернуть коллекцию list
     *
     * @param speeds
     * @return list
     */
    public List<String> getPreparedList(List<Speed> speeds) {

        List<Speed> speeds1 = new ArrayList<>(speeds);
        List<Speed> speeds2 = new ArrayList<>(speeds);
        List<String> list = new ArrayList<>();

        Collections.sort(speeds1, new SpeedSortByValue());

        for (Speed speed : speeds1) {
            list.add(speed.toString() + "\n");
        }
        list.add("\n");

        Collections.sort(speeds1, new SpeedSortByMeasure().thenComparing(new SpeedSortByValue()));

        for (Speed speed : speeds1) {
            list.add(speed.toString() + "\n");
        }
        list.add("\n");

        for (Speed speed : speeds2) {
            list.add(speed.toString() + " = " + speed.getValueMs() + " m/s" + "\n");
        }

        return list;
    }
}
