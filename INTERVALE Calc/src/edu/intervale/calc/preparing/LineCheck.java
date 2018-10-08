package edu.intervale.calc.preparing;

/**
 * Класс реализует методы проверки строки с выражением на наличие скобок и математических символов,
 * и правилности их установки.
 *
 * @author Maksim Aliakhnovich
 */
public class LineCheck {

    /**
     * Вызывает все методы класса.
     *
     * @param line строка с выражением.
     * @return boolean = true если корректна.
     */
    public static boolean getLineCheck(String line) {
        return isBracketCorrect(line) && getSymbolsCorrect(line);
    }

    /**
     * Проверка на существование скобок.
     *
     * @param line строка, проверяемая на наличие скобок.
     * @return boolean = true если скобки присутствуют.
     */
    private static boolean isBracketCorrect(String line) {
        return line.contains("(") || line.contains(")") ? getBracketCount(line) : true;
    }

    /**
     * Проверка на соответствие количества скобок.
     *
     * @param line строка, содержащая скобки.
     * @return boolean = true если строка корректна.
     */
    private static boolean getBracketCount(String line) {

        int countBktOpen = 0;
        int countBktClose = 0;

        for (int f = 0; f < line.length(); f++) {
            if (line.charAt(f) == '(') {
                countBktOpen++;
            }
            if (line.charAt(f) == ')') {
                countBktClose++;
            }
        }
        return countBktOpen == countBktClose ? getBracketCorrect(line) : false;
    }

    /**
     * Проверка на корректность установки скобок.
     *
     * @param line строка, содержащая скобки.
     * @return boolean = true если строка корректна.
     */
    private static boolean getBracketCorrect(String line) {

        if (line.indexOf("(") > line.indexOf(")")) {
            return false;
        } else if (line.lastIndexOf("(") > line.lastIndexOf(")")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Проверяет строку на кооректность установки математических символов (* / + - ^).
     *
     * @param line строка с выражением.
     * @return boolean = true если строка корректна.
     */
    private static boolean getSymbolsCorrect(String line) {
        return getSymbolFirst(line, "*") &&
                getSymbolFirst(line, "/") &&
                getSymbolFirst(line, "^") &&
                getSymbolEnd(line, "*") &&
                getSymbolEnd(line, "/") &&
                getSymbolEnd(line, "^") &&
                getSymbolEnd(line, "+") &&
                getSymbolEnd(line, "-");
    }

    /**
     * Проверка, начинается ли строка с указанного символа.
     *
     * @param line   строка, содержащая указанный символ.
     * @param symbol символ, который мы ищем в начале строки.
     * @return boolean = false если не содержит символа.
     */
    private static boolean getSymbolFirst(String line, String symbol) {
        return !line.startsWith(symbol);
    }

    /**
     * Проверка, заканчивается ли строка указанным символом.
     *
     * @param line   строка, содержащая указанный символ.
     * @param symbol символ, который мы ищем в конце строки.
     * @return boolean = false если не содержит символа.
     */
    private static boolean getSymbolEnd(String line, String symbol) {
        return !line.endsWith(symbol);
    }
}
