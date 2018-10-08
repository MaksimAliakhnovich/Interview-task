package edu.epam.speedconverter.fileio;

import edu.epam.speedconverter.model.Speed;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SpeedFileReader {

    /**
     * ваша переменная, которая знает имя файла для чтения
     */
    private String fileInputPath = "input.txt";

    /**
     * этот метод создаст коллекцию List<String> list
     * при помощи метода getList
     * затем переберет эту коллекцию
     * и каждую строку превратит в массив строк при помощи метода класса String
     * получим два параметра для класса Speed
     * затем каждую строку (два параметра) положит в коллекцию List<Speed> speeds
     * вернет полученную коллекцию
     *
     * @return speeds
     */
    public List<Speed> readFromFile() {

        List<String> list = getList();
        List<Speed> speeds = new ArrayList<>();

        for (String s : list) {
            String[] array = s.split(" ");
            int value = Integer.parseInt(array[0]);
            String measure = array[1];
            speeds.add(new Speed(value, measure));
        }

        return speeds;
    }

    /**
     * этот метод читает файл
     * и записывает все строки в коллекцию List<String> list
     * возвращает list
     *
     * @return list
     */
    private List<String> getList() {

        List<String> list = null;

        try {
            list = Files.readAllLines(Paths.get(fileInputPath), Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
