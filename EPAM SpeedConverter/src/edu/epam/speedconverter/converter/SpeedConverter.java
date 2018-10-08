package edu.epam.speedconverter.converter;

import edu.epam.speedconverter.fileio.ResultPreparer;
import edu.epam.speedconverter.fileio.SpeedFileReader;
import edu.epam.speedconverter.fileio.SpeedFileWriter;
import edu.epam.speedconverter.model.Speed;

import java.util.List;

/**
 * 1. получаем коллекцию List<Speed> speeds из SpeedFileReader
 * 2. получаем коллекцию List<String> list из ResultPreparer
 * 3. отправляем list в SpeedFileWriter
 */
public class SpeedConverter {

    public void getResult() {

        SpeedFileReader speedFileReader = new SpeedFileReader();
        List<Speed> speeds = speedFileReader.readFromFile();

        if (speeds.isEmpty()) {
            System.out.println("Не удалось прочитать файл или он пуст");
        } else {
            ResultPreparer resultPreparer = new ResultPreparer();
            List<String> list = resultPreparer.getPreparedList(speeds);

            SpeedFileWriter speedFileWriter = new SpeedFileWriter();
            speedFileWriter.writeToFile(list);
        }
    }
}
