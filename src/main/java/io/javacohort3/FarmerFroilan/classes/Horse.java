package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Animal;
import io.javacohort3.FarmerFroilan.abstracts.Edible;
import io.javacohort3.FarmerFroilan.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public void eat(Edible edible) {
        System.out.println("Horse has eaten");
    }

    public void makeNoise() {
        System.out.println("watch me whip and neigh!!!");
    }
}