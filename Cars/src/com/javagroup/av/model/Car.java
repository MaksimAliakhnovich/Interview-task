package com.javagroup.av.model;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String fuel;
    private String color;
    private double price;
    private boolean used;

    public Car() {
    }

    public Car(String brand, String model, int year, String fuel, String color, double price, boolean used) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.color = color;
        this.price = price;
        this.used = used;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        String isNew = used ? "новая" : "б/у";
        return String.format("%15.15s |%20.20s |%5d |%10.10s |%8.8s |%10.2f |%10.10s",
                brand, model, year, fuel, color, price, isNew);
    }

}
