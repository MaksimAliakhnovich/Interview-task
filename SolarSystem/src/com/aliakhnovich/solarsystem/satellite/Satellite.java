package com.aliakhnovich.solarsystem.satellite;

/**
 * Created by mascon on 23.12.2017.
 */
public class Satellite {

    private int number;
    private String name;
    private String type;

    public Satellite() {
    }

    public Satellite(int number, String name, String type) {
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\t Спутник №" +
                number +
                " - " +
                name +
                ", тип: " +
                type;
    }
}
