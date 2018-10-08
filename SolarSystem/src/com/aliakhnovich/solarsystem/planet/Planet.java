package com.aliakhnovich.solarsystem.planet;

import com.aliakhnovich.solarsystem.satellite.Satellite;

import java.util.List;

/**
 * Created by mascon on 23.12.2017.
 */
public class Planet {

    private int number;
    private String name;
    private String type;
    private List<Satellite> satellites;

    public Planet() {
    }

    public Planet(int number, String name, String type, List<Satellite> satellites) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.satellites = satellites;
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

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(List<Satellite> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {

        String satelliteList = "";

        if (satellites == null) {
            satelliteList = ", спутники: нет \n";
        } else {
            for (Satellite satellite : satellites) {
                satelliteList = satelliteList + " " + satellite + "\n";
            }
            satelliteList = ", спутники: \n" + satelliteList;
        }
        return "Планета №" +
                number +
                " - " +
                name +
                ", тип: " +
                type +
                satelliteList;
    }
}
