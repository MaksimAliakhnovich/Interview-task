package edu.intervale.calc.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс реализует методы округления дробных чисел.
 *
 * @author Maksim Aliakhnovich
 */
public class Round {

    /**
     * Переменная, указывающая кол-во символов после запятой для Calc1.
     */
    private static final int SCALE_SIZE_1 = 1;

    /**
     * Переменная, указывающая кол-во символов после запятой для Calc2.
     */
    private static final int SCALE_SIZE_5 = 5;

    /**
     * Метод реализует округление дробного числа для Calc1.
     *
     * @param digit double digit
     * @return ро
     */
    public static double getRoundCalc1(double digit) {
        return new BigDecimal(digit).setScale(SCALE_SIZE_1, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Метод реализует округление дробного числа для Calc2.
     *
     * @param digit double digit
     * @return рпаро
     */
    public static double getRoundCalc2(double digit) {
        return new BigDecimal(digit).setScale(SCALE_SIZE_5, RoundingMode.HALF_UP).doubleValue();
    }
}

