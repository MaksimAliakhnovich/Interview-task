package edu.itstep.chef.ingredients.base.impl;

import edu.itstep.chef.ingredients.base.Ingredient;

public class Fruit extends Ingredient {

    public Fruit(String name, int energy, String type, int weight) {
        super(name, energy, type, weight);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
