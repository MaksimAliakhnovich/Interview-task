package edu.intervale.calc.fileio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Класс предназначен для построкового чтения выражений из файла input и записи прочитанных выражений в коллекцию.
 *
 * @author Maksim Aliakhnovich
 */

public class ReadInputFile {

//    /**
//     * Метод читает файл input, соответствующий калькулятору
//     * и записывает все строки в коллекцию List<String> list.
//     *
//     * @param pathInputFile Путь к файлу input.
//     * @return listExpression Коллеция с выражениями из прочитанного файла input.
//     */


    public List<String> getListExpression(String pathInputFile) {

        try {
            List<String> listExpression = Files.readAllLines(Paths.get(pathInputFile), Charset.forName("UTF-8"));
            return listExpression;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Еrror reading the file.");
        }
        return null;
    }
}
