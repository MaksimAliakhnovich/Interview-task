package edu.itstep.chef.menu;

import edu.itstep.chef.compare.IngredientSortByEnergy;
import edu.itstep.chef.ingredients.backet.*;
import edu.itstep.chef.ingredients.base.Ingredient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainMenu {

    private ArrayList<Ingredient> salad = new ArrayList<>();

    public void getMainMenu() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("---------------\n" +
                    "Вы можете:\n" +
                    "1. Создать салат\n" +
                    "2. Просмотр салата\n" +
                    "3. Сортировка по калорийности\n" +
                    "4. Поиск по калорийности\n" +
                    "5. Попробовать заново\n" +
                    "0. Выход");
            int menu1 = Integer.valueOf(bufferedReader.readLine());

            switch (menu1) {
                case 0:
                    System.out.println("Выход");
                    System.exit(0);
                    break;
                case 1:

                    boolean while2 = true;
                    while (while2) {
                        System.out.println("---------------");
                        System.out.println("Добавьте ингридиент:");
                        System.out.println(
                                "1. Огурец\n" +
                                        "2. Томат\n" +
                                        "3. Масло\n" +
                                        "4. Сметана\n" +
                                        "5. Соль\n" +
                                        "0. Назад");
                        int menu2 = Integer.valueOf(bufferedReader.readLine());
                        int weightIngredient = 0;

                        switch (menu2) {
                            case 0:
                                while2 = false;
                                break;
                            case 1:
                                System.out.println("Вам сколько взвесить?");
                                weightIngredient = Integer.valueOf(bufferedReader.readLine());
                                if (weightIngredient > 0) {
                                    salad.add(new Cucumber(weightIngredient));
                                    System.out.println("М-м-м, прекрасный выбор!");
                                }
                                break;
                            case 2:
                                System.out.println("Вам сколько взвесить?");
                                weightIngredient = Integer.valueOf(bufferedReader.readLine());
                                if (weightIngredient > 0) {
                                    salad.add(new Tomat(weightIngredient));
                                }
                                break;
                            case 3:
                                System.out.println("Сколько ложек?");
                                weightIngredient = Integer.valueOf(bufferedReader.readLine());
                                if (weightIngredient > 0) {
                                    salad.add(new SunflowerOil(weightIngredient));
                                }
                                break;
                            case 4:
                                System.out.println("Сколко ложек?");
                                weightIngredient = Integer.valueOf(bufferedReader.readLine());
                                if (weightIngredient > 0) {
                                    salad.add(new SourCream(weightIngredient));
                                }
                                break;
                            case 5:
                                System.out.println("Как солим?\n" +
                                        "1. Слабо\n" +
                                        "2. Средне\n" +
                                        "3. Пересол\n" +
                                        "0. Передумал");
                                int salt = Integer.valueOf(bufferedReader.readLine());
                                switch (salt) {
                                    case 0:
                                        break;
                                    case 1:
                                        weightIngredient = 3;
                                        break;
                                    case 2:
                                        weightIngredient = 5;
                                        break;
                                    case 3:
                                        weightIngredient = 7;
                                        break;
                                }
                                if (weightIngredient > 0) {
                                    salad.add(new Salt(weightIngredient));
                                }
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("---------------");
                    if (salad.isEmpty()) {
                        System.out.println("Тарелка пока пуста. Творите! ...то есть, крошите!");
                    } else {
                        System.out.println("Итак, что мы имеем:");
                        for (Ingredient ingredient : salad) {
                            System.out.println(ingredient);
                        }
                    }
                    break;
                case 3:
                    System.out.println("---------------");
                    salad.sort(new IngredientSortByEnergy());
                    System.out.println("Отсортировано.");
                    break;
                case 4:
                    System.out.println("---------------");
                    System.out.println("Задайте диапазон. От");
                    int energyFindStart = Integer.valueOf(bufferedReader.readLine());
                    System.out.println("до");
                    int energyFindEnd = Integer.valueOf(bufferedReader.readLine());
                    System.out.println("Найдено:");
                    int ingredientCount = 0;
                    for (Ingredient ingredient : salad) {
                        if (ingredient.getEnergy() >= energyFindStart && ingredient.getEnergy() <= energyFindEnd) {
                            System.out.println(ingredient);
                            ingredientCount++;
                        }
                    }
                    if (ingredientCount == 0) {
                        System.out.println("0 ингридиентов.");
                    }
                    break;
                case 5:
                    salad.clear();
                    System.out.println("Бывает...");
            }
        }
    }
}
