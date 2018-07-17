package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Animal;
import io.javacohort3.FarmerFroilan.abstracts.Edible;
import io.javacohort3.FarmerFroilan.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    public void makeNoise() {
        System.out.println("Cock-a-doodle-doo!");
    }

    public void eat(Edible edible) {
        System.out.println("chicken has eaten");
    }

    public EdibleEgg yield() {
        return new EdibleEgg();
    }
}
