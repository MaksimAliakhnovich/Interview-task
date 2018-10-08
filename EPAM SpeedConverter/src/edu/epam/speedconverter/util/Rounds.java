package edu.epam.speedconverter.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounds {

    /**
     * получаем значение, округляем, возвращаем
     *
     * @param value
     * @return result
     */
    public static double getRound(double value) {

        return new BigDecimal(value).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }
}
