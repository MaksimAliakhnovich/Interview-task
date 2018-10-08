package edu.itstep.chef.ingredients.base;

import java.util.Comparator;

public abstract class Ingredient implements Comparator<Ingredient>, Comparable<Ingredient> {

    protected String name;

    protected int energy;

    protected String type;

    protected int weight;

    public Ingredient(String name, int energy, String type, int weight) {
        this.name = name;
        this.energy = energy * weight / 1000;
        this.type = type;
        this.weight = weight;
    }

    public abstract String getName();

    public abstract int getEnergy();

    public abstract String getType();

    public abstract int getWeight();

    @Override
    public String toString() {
        return type + " " + name + " " + weight + "г, " + energy + "ккал";
    }

    public int compare(Ingredient ingredient1, Ingredient ingredient2) {

        return ingredient1.getEnergy() - ingredient2.getEnergy();
    }

    @Override
    public int compareTo(Ingredient ingredient) {

        if (ingredient == null) {
            throw new NullPointerException();
        } else if (ingredient.energy == this.energy) {
            return 0;
        } else {
            return -1;
        }
    }
}
