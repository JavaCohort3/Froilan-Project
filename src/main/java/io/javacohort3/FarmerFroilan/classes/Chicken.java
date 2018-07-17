package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.interfaces.Produce;
import io.javacohort3.FarmerFroilan.abstracts.Animal;
import io.javacohort3.FarmerFroilan.classes.EdibleEgg;

public class Chicken extends Animal implements Produce {

    @Override
    public EdibleEgg yield(){
        return new EdibleEgg();
    }
    //chicken can yeild edible eggs
}
