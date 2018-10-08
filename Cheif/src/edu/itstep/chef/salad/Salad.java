package edu.itstep.chef.salad;

import edu.itstep.chef.ingredients.base.Ingredient;

public class Salad {

    private Ingredient ingredient;

    public Salad(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return ingredient.toString();
    }
}
