package edu.intervale.calc;

import edu.intervale.calc.fileio.ReadInputFile;
import edu.intervale.calc.fileio.WriteOutputFile;
import edu.intervale.calc.operation.Round;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс реализует методы чтения, вычисления и записи ответов в файл.
 *
 * @author Maksim Aliakhnovich
 * @see "https://ru.wikipedia.org/wiki/%D0%9E%D0%B1%D1%80%D0%B0%D1%82%D0%BD%D0%B0%D1%8F_%D0%BF%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C Обратная Польская Нотация (ОПН)"
 * @see "https://javatalks.ru/posts/169177 реализация ОПН без степеней, процентов(как в условии), дробных чисел и округления"
 */
public class Calc1 {
    /**
     * Проверяет является ли символ оператором.
     *
     * @param c проверяемый символ.
     * @return boolean = true если символ является оператором.
     */
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^';
    }

    /**
     * Присваивает приоритет оператору.
     *
     * @param op символ оператора.
     * @return int число приоритета оператора.
     */
    private int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    /**
     * Производит операции над простейшими выражениями.
     *
     * @param st Коллекция выражений.
     * @param op Символ оператора.
     */
    private void processOperator(LinkedList<Double> st, char op) {

        /**
         *Правый операнд.
         */
        double r = st.removeLast();

        /**
         *Левый операнд.
         */
        double l = st.removeLast();

        switch (op) {
            case '+':
                st.add(l + r);
                break;
            case '-':
                st.add(l - r);
                break;
            case '*':
                st.add(l * r);
                break;
            case '/':
                st.add(l / r);
                break;
            case '%':
                st.add((l / 100) * r);
                break;
            case '^':
                st.add(Math.pow(l, r));
                break;
        }
    }

    /**
     * Производит решение приходящего выражения.
     *
     * @param s Приходящая проверенная и подготовленная строка с выражением.
     * @return int ответ.
     */
    public double eval(String s) {

        LinkedList<Double> st = new LinkedList<>();
        LinkedList<Character> op = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                op.add('(');
            } else if (c == ')') {
                while (op.getLast() != '(') {
                    processOperator(st, op.removeLast());
                }
                op.removeLast();
            } else if (isOperator(c)) {
                while (!op.isEmpty() && priority(op.getLast()) >= priority(c)) {
                    processOperator(st, op.removeLast());
                }
                op.add(c);
            } else {
                String operand = "";
                while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {
                    operand += s.charAt(i++);
                }
                --i;
                st.add(Double.parseDouble(operand));
            }
        }

        while (!op.isEmpty()) {
            processOperator(st, op.removeLast());
        }

        return st.get(0);
    }

    /**
     * Вызывает метод чтения выражения, проверки и подготовки строки, решения выражения, округления ответа и записи ответа в файл.
     *
     * @param pathInput1  Путь к файлу с выражениями.
     * @param pathOutput1 Путь к файлу с ответами.
     * @throws IOException
     */
    public void getCalc1(String pathInput1, String pathOutput1) throws IOException {

        ReadInputFile readInputFile = new ReadInputFile();

        List<String> listExpression = readInputFile.getListExpression(pathInput1);
        List<String> listResult = new ArrayList<>();

        String result;

        for (String expression : listExpression) {

            // проверка деления на ноль и округление ответа
            if (String.valueOf(eval(expression)).equals("Infinity")) {
                result = "Division by zero";
            } else {
                result = String.valueOf(Round.getRoundCalc1(eval(expression)));
            }

            // округление ответа, если это целое число
            if (result.endsWith(".0")) {
                listResult.add(result.substring(0, result.length() - 2));
            } else {
                listResult.add(result);
            }
        }

        WriteOutputFile writeOutputFile = new WriteOutputFile();
        writeOutputFile.writeToFile(listExpression, listResult, pathOutput1);
    }


}
