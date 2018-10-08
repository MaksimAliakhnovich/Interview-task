package edu.epam.speedconverter.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SpeedFileWriter {

    /**
     * переменная которая знает о файле в который мы будем писать рузультат
     */
    private String fileOutputPath = "output.txt";

    /**
     * 1. если файл есть, по возможности удалить его
     * 2. полученную коллекцию строк записать в файл при помощи BufferedWriter
     *
     * @param list
     */
    public void writeToFile(List<String> list) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutputPath))) {

            if (!list.isEmpty()) {
                for (String s : list) {
                    bufferedWriter.write(s);
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
