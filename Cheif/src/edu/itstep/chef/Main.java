package edu.itstep.chef;

import edu.itstep.chef.menu.MainMenu;

import java.io.IOException;

public class Main {

    /*
    cucumber - огурец
    sour cream - сметана
    tomato - томат
    sunflower oil - масло подсолнечное
    salt - соль
    */

    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.getMainMenu();
    }
}
