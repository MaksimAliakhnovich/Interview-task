package edu.itstep.chef.compare;

import edu.itstep.chef.ingredients.base.Ingredient;

import java.util.Comparator;

public class IngredientSortByEnergy implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient ingredient1, Ingredient ingredient2) {

        return ingredient1.getEnergy() - ingredient2.getEnergy();
    }
}
