package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Crop;
import io.javacohort3.FarmerFroilan.classes.EarCorn;

public class CornStalk extends Crop {

    public EarCorn yield() {
        return new EarCorn();
    }
}
