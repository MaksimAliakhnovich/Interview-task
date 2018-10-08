package edu.intervale.calc;

import edu.intervale.calc.fileio.ReadInputFile;
import edu.intervale.calc.fileio.WriteOutputFile;
import edu.intervale.calc.operation.Round;
import edu.intervale.calc.preparing.LineCheck;
import edu.intervale.calc.preparing.LinePreparing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует методы чтения, вычисления и записи ответов в файл.
 *
 * @author Maksim Aliakhnovich
 */
public class Calc2 extends Calc1 {

    @Override
    public void getCalc1(String pathInput2, String pathOutput2) throws IOException {

        ReadInputFile readInputFile = new ReadInputFile();

        List<String> listExpression = readInputFile.getListExpression(pathInput2);
        List<String> listResult = new ArrayList<>();
        String result;
        String preparedExpression;

        for (String expression : listExpression) {

            preparedExpression = LinePreparing.getLinePrepared(expression);
            if (LineCheck.getLineCheck(preparedExpression)) {

                result = String.valueOf(eval(preparedExpression));

                if (result.equals("Infinity")) {
                    result = "Division by zero";
                } else {
                    result = String.valueOf(Round.getRoundCalc2(Double.valueOf(result)));
                }

                if (result.endsWith(".00000")) {
                    listResult.add(result.substring(0, result.length() - 6));
                } else if (result.endsWith(".0")) {
                    listResult.add(result.substring(0, result.length() - 2));
                } else {
                    listResult.add(result);
                }
            } else {
                listResult.add("Error. Check expression");
            }
        }

        WriteOutputFile writeOutputFile = new WriteOutputFile();
        writeOutputFile.writeToFile(listExpression, listResult, pathOutput2);
    }
}
