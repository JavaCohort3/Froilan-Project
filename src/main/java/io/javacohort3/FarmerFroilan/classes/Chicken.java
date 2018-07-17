package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Animal;
import io.javacohort3.FarmerFroilan.classes.EdibleEgg;
import io.javacohort3.FarmerFroilan.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    public void makeNoise() {
        System.out.println("Cock-a-doodle-doo!");
    }

    public EdibleEgg yield() {
        return null;
    }
}
