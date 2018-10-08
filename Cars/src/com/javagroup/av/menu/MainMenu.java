package com.javagroup.av.menu;

import com.javagroup.av.comparators.CarSortByBrand;
import com.javagroup.av.comparators.CarSortByModel;
import com.javagroup.av.comparators.CarSortByPrice;
import com.javagroup.av.model.Car;
import com.javagroup.av.util.Catalog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class MainMenu {

    Catalog catalog = new Catalog();
    List<Car> cars = catalog.getCars();

    public void getMainMenu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean menu = true;

        while (menu) {
            getMenu();
            int item = Integer.parseInt(reader.readLine());
            switch (item) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    showCars();
                    break;
                case 2:
                    searchCar();
                    break;
                case 3:
                    addMyCar();
                    break;
                default:
                    menu = false;
            }
        }
    }

    private void showCars() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean menu = true;

        while (menu) {
            getSubMenu1();
            int item = Integer.parseInt(reader.readLine());
            switch (item) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    printCars(cars);
                    break;
                case 2:
                    Collections.sort(cars, new CarSortByBrand());
                    printCars(cars);
                    break;
                case 3:
                    Collections.sort(cars, new CarSortByBrand().thenComparing(new CarSortByModel()));
                    printCars(cars);
                    break;
                case 4:
                    Collections.sort(cars, new CarSortByBrand().thenComparing(new CarSortByModel()).thenComparing(new CarSortByPrice()));
                    printCars(cars);
                    break;
                case 5:
                    Collections.sort(cars, new CarSortByPrice());
                    printCars(cars);
                    break;
                default:
                    menu = false;
            }
        }
    }

    private void searchCar() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean menu = true;

        while (menu) {
            getSubMenu2();
            int item = Integer.parseInt(reader.readLine());
            switch (item) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    String brand = "Lada";
                    for (Car car : cars) {
                        if (car.getBrand().equalsIgnoreCase(brand)) {
                            System.out.println(car);
                            break;
                        }
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    menu = false;
            }
        }
    }

    private void addMyCar() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter brand: ");
        String inputBrand = reader.readLine();

        System.out.print("Enter model: ");
        String inputModel = reader.readLine();

        System.out.print("Enter year: ");
        int inputYear = Integer.parseInt(reader.readLine());

        System.out.print("Enter fuel: ");
        String inputFuel = reader.readLine();

        System.out.print("Enter color: ");
        String inputColor = reader.readLine();

        System.out.print("Enter price: ");
        double inputPrice = Integer.parseInt(reader.readLine());
        System.out.print("Is used (default yes. type 'no' to change, or 'yes' to confirm): ");
        String inputUsed = reader.readLine();
        boolean used = true;
        if (inputUsed.equalsIgnoreCase("no")) {
            used = false;
        }
        Car car = new Car();
        car.setBrand(inputBrand);
        car.setModel(inputModel);
        car.setYear(inputYear);
        car.setFuel(inputFuel);
        car.setColor(inputColor);
        car.setPrice(inputPrice);
        car.setUsed(used);

        catalog.setCar(cars, car);
    }

    private void printCars(List<Car> cars) {
        System.out.println("-----------------------------------------");
        System.out.format("%15.15s |%20.20s |%5.5s |%10.10s |%8.8s |%10.10s |%10.10s%n",
                "МАРКА", "МОДЕЛЬ", "ГОД", "ТОПЛИВО", "ЦВЕТ", "ЦЕНА", "СОСТОЯНИЕ");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("-----------------------------------------");
    }


    private void getMenu() {
        System.out.println("1 - Show all cars\n" +
                "2 - Search cars\n" +
                "3 - Add my car\n" +
                "0 - Exit");
        System.out.print("Please make the choice: ");
    }

    private void getSubMenu1() {
        System.out.println("1 - Without sort\n" +
                "2 - Sort by Brand\n" +
                "3 - Sort by Brand + Model\n" +
                "4 - Sort by Brand + Model + Price\n" +
                "5 - Sort by Price\n" +
                "0 - Back");
        System.out.print("Please make the choice: ");
    }

    private void getSubMenu2() {
        System.out.println("1 - Search by Brand\n" +
                "2 - Search by Model\n" +
                "3 - Search by Price\n" +
                "0 - Back");
        System.out.print("Please make the choice: ");
    }
}
