package edu.epam.speedconverter.model;

import edu.epam.speedconverter.util.Converter;

public class Speed {

    private int value;
    private String measure;
    private String valueMs;

    public Speed(int value, String measure) {
        this(value, measure, Converter.getConvertedValue(value, measure));
    }

    private Speed(int value, String measure, String valueMs) {
        this.value = value;
        this.measure = measure;
        this.valueMs = valueMs;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getValueMs() {
        return valueMs;
    }

    public void setValueMs(String valueMs) {
        this.valueMs = valueMs;
    }

    @Override
    public String toString() {
        return value + " " + measure;
    }
}
