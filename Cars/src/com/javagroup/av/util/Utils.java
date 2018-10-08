package com.javagroup.av.util;

public class Utils {

    /**
     * метод который получает строку
     * переводит ее в нижний регистр
     * а затем переводит в верхний регистр первую букву
     * @param line предположительно некорректная строка
     * @return line - откорректированная строка
     */
    public static String getCurrentLine(String line) {
        String line1 = line.substring(0,1).toUpperCase();
        String line2 = line.substring(1).toLowerCase();
        return line1 + line2;
    }
}
