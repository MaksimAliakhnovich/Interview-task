package edu.intervale.calc.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Класс реализует метод построковой записи исходных выражений и ответов в файл output соответствующего калькулятора.
 *
 * @author Maksim Aliakhnovich
 */
public class WriteOutputFile {

    /**
     * Метод реализует построковую запись исходных выражений и ответов в файл output соответствующего калькулятора.
     *
     * @param listExpression Коллекция с выражениями.
     * @param listResult     Коллекция с ответами.
     * @param pathOutputFile Путь к файлу output.
     */
    public void writeToFile(List<String> listExpression, List<String> listResult, String pathOutputFile) {

        try (FileWriter fw = new FileWriter(pathOutputFile)) {

            int i = 0;

            if (listExpression.size() == listResult.size()) {
                for (String expression : listExpression) {
                    fw.write(expression + " = " + listResult.get(i) + "\n");
                    i++;
                }
            } else {
                System.out.println("The number of expressions does not match the number of answers. The answer is lost.");
            }

            fw.flush();

            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}