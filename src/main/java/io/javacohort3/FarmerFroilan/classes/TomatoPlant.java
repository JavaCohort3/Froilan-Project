package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Crop;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        return new Tomato();
    }
}
