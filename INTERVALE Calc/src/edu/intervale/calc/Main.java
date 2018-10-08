package edu.intervale.calc;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final String PATH_INPUT_1 = "input_1.txt";
        final String PATH_OUTPUT_1 = "output_1.txt";

        final String PATH_INPUT_2 = "input_2.txt";
        final String PATH_OUTPUT_2 = "output_2.txt";

        Calc1 calc1 = new Calc1();
        calc1.getCalc1(PATH_INPUT_1, PATH_OUTPUT_1);

        Calc2 calc2 = new Calc2();
        calc2.getCalc1(PATH_INPUT_2, PATH_OUTPUT_2);

    }
}
