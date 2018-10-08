package edu.epam.speedconverter.util;

public class Converter {

    /**
     * статический метод, который вычисляет полученное значение в m/s
     * и возвращает полученный результат округленный методом класса Rounds
     *
     * @param value
     * @param measure
     * @return result
     */
    public static String getConvertedValue(int value, String measure) {

        if (measure.equals("kmh")) {
            return String.valueOf(Rounds.getRound(((double) value * 1000) / 3600));
        } else if (measure.equals("mph")) {
            return String.valueOf(Rounds.getRound(((double) value * 1609) / 3600));
        } else if (measure.equals("kn")) {
            return String.valueOf(Rounds.getRound(((double) value * 1852) / 3600));
        } else if (measure.equals("m/s")) {
            return String.valueOf(value);
        } else {
            return "0";
        }
    }
}
