package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.interfaces.Aircraft;
import io.javacohort3.FarmerFroilan.storage.CropRow;

public abstract class CropDuster implements Aircraft {

    public CropDuster() {
    }

    public void fertilize(CropRow cropRow){
        System.out.println("Crops were fertilized " + cropRow);
    }

    @Override
    public String toString() {
        return "CropDuster{}";
    }
}
