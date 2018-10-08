package edu.itstep.chef.ingredients.backet;

import edu.itstep.chef.ingredients.base.impl.Spice;

public class SourCream extends Spice {

    public SourCream(int weight) {
        super("Сметана", 500, "Специя", weight * 20);
    }
}
