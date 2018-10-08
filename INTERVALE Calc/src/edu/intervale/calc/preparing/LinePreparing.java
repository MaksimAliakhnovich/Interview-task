package edu.intervale.calc.preparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс реализует методы проверки строки с выражением на наличие недопустимых символов, букв, двойных знаков.
 *
 * @author Maksim Aliakhnovich
 * @author ITstep javagroup 31017
 */
public class LinePreparing {

    /**
     * Список разрешенных символов.
     */
    private static final List<String> SYMBOLS_LIST = new ArrayList<>(
            Arrays.asList(
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                    "(", ")", "*", "/", "+", "-", ",", "^", ".", "%"
            )
    );

    /**
     * Подготовка строки, вызов всех методов.
     *
     * @param line начальная строка.
     * @return line строка после после подготовки.
     */
    public static String getLinePrepared(String line) {

        line = getLineWithoutLetters(line);

        if (line.contains(",")) {
            line = getLineReplaceCommas(line);
        }

        if (line.contains("**") | line.contains("//") | line.contains("++") | line.contains("--") | line.contains("()")) {
            line = getLineReplaceDouble(line);
        }

        if (line.charAt(0) == '+') {
            line = line.substring(1);
        }

        return line;
    }

    /**
     * Замена всех запятых, на точки.
     *
     * @param line строка с запятыми.
     * @return line строка с точками.
     */
    private static String getLineReplaceCommas(String line) {
        return line.replace(",", ".");
    }

    /**
     * Удаление дубликатов символов.
     *
     * @param line строка с дубликатами.
     * @return line строка без дубликатов.
     */
    private static String getLineReplaceDouble(String line) {

        while (line.contains("**") | line.contains("//") | line.contains("++") | line.contains("()")) {
            line = line.replace("**", "*")
                    .replace("//", "/")
                    .replace("++", "+")
                    .replace("()", "");
        }

        if (line.contains("--")) {
            while (line.contains("--")) {
                int coord = line.indexOf("--");
                if (line.length() == coord + 2) {
                    line = line.substring(0, coord);
                }
                line = line.replace("--", "+");
            }
        }
        return line;
    }

    /**
     * Удаление всех символов, кроме указанных.
     *
     * @param line строка, предположительно, содержащая ненужные символы.
     * @return line строка, содержащая только указанные символы.
     */
    private static String getLineWithoutLetters(String line) {

        StringBuilder result = new StringBuilder();

        for (int f = 0; f < line.length(); f++) {
            String symbol = String.valueOf(line.charAt(f));
            if (SYMBOLS_LIST.contains(symbol)) {
                result.append(symbol);
            }
        }
        return getLineCorrect(result.toString());
    }

    /**
     * Удаление ненужных математических символов в конце и в начале строки.
     *
     * @param line строка, предположительно, с символами в начале и в конце.
     * @return line корректная строка.
     */
    private static String getLineCorrect(String line) {

        // убираем математические символы в конце строки
        while (!Character.isDigit(line.charAt(line.length() - 1)) & line.charAt(line.length() - 1) != ')') {
            line = line.substring(0, line.length() - 1);
        }

        // ищем координату первого вхождения числа или скобки
        int coord = 0;

        for (int f = 0; f < line.length(); f++) {
            if (Character.isDigit(line.charAt(f)) | line.charAt(f) == '(') {
                break;
            } else {
                coord = f + 1;
            }
        }

        // убираем математические символы в начале строки (кроме минуса)
        if (line.substring(0, coord).contains("-")) {
            line = "-".concat(line.substring(coord));
        } else {
            line = line.substring(coord);
        }

        return line;
    }
}