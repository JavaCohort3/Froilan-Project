package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.abstracts.Crop;
import io.javacohort3.FarmerFroilan.interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {
    public void operate() {

    }

    public void harvest(Crop crop){
        System.out.println("Harvested Crops " + crop);
    }

    @Override
    public String toString() {
        return "Tractor{}";
    }
}
