package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.interfaces.Aircraft;
import io.javacohort3.FarmerFroilan.storage.CropRow;

public class CropDuster implements Aircraft {
    public void fly() {
        
    }

    public void fertilize(CropRow cropRow){
        System.out.println("Crops were fertilized " + cropRow);
    }

    @Override
    public String toString() {
        return "CropDuster{}";
    }


}
