package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Animal;
import io.javacohort3.FarmerFroilan.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public void makeNoise() {
        System.out.println("bdd-ddd-dd-rrr");
    }
}