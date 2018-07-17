package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.interfaces.Aircraft;
import io.javacohort3.FarmerFroilan.interfaces.FarmVehicle;
import io.javacohort3.FarmerFroilan.storage.CropRow;

public class CropDuster implements Aircraft, FarmVehicle {
    public void fly() {
        System.out.println("Flying");
    }

    public void operate() {

    }

    public void fertilize(CropRow cropRow){
        System.out.println("Crops were fertilized " + cropRow);
    }

    @Override
    public String toString() {
        return "CropDuster{}";
    }



}
